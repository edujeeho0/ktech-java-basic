# KTech Java Project 1

간단한 텍스트 기반 TODO list Application 만들기

## 실행

`Main.java`를 `javac`로 컴파일 후 `java`로 실행

또는

Intellij IDEA 프로젝트로 열고, `Main` 실행

### 실행하게 될 경우

작성된 TODO를 저장하기 위해 `todo.csv`가 생성됩니다.
만일 이미 존재하는 `todo.csv`가 있다면 해당 내용을 이용해 데이터를 불러옵니다.
만약 `todo.csv`의 내용이 이 애플리케이션에서 작성한 내용이 아니면 오류가 발생합니다.
만약 실행 이후 임의로 `todo.csv`를 만든 다음 애플리케이션을 종료할 경우 **내용물이 덮어씌워지거나 데이터가 정상적으로 저장되지 않을 수 있습니다.**

## 기술

- Java 17
  - Graalvm CE for OpenJDK 17

## 요구사항

- [x] 첫 화면
- [x] 종료하기
- [x] TODO 만들기
- [x] TODO 수정하기
- [x] TODO 완료하기
- [x] TODO 삭제하기
- [x] 재시작해도 TODO 유지
- [x] 오류 입력에 대한 대응

## Review

### TODO 데이터 - `Todo`

저장해야 하는 데이터는 총 세종류로
- 내용 또는 제목
- 기한
- 완료 여부
각각 다음과 같이 속성을 정의하였다.

```java
private String title;
private LocalDate dueDate;
private boolean completed;
```

여기서 `LocalDate`는 `LocalDate.parse(CharSequence text)`로 `yyyy-mm-dd`의 형태로 작성된 문자열을 비교가능한 날짜 데이터로 바꿔줄 수 있으며,
반대로 `LocalDate`를 문자열로 변환하면 `yyyy-mm-dd`로 만들어지기 때문에 사용하기 편하기 때문에 채택되었다.

생성자는 총 두개를 만들었는데,
- 첫번째 생성자는 처음 `Todo`를 만들때 사용하는 완료 안된 TODO를 위한 생성자
- 두번째 생성자는 이미 저장된 TODO 정보를 읽어들여 `Todo`로 만들 때를 위한 생성자
두가지를 만들었다. `this()`를 이용해 첫번째 생성자가 두번째 생성자를 호출하는 형태로 만들었다.

```java
public Todo(String title, LocalDate dueDate) {
    this(title, dueDate, false);
}

public Todo(String title, LocalDate dueDate, boolean completed) {
    this.title = title;
    this.dueDate = dueDate;
    this.completed = completed;
}
```

Getter와 Setter는 대부분 만들었는데, `setCompleted` 대신 `complete()`만 만들어서 "완료하기" 기능만 만들었다.

```java
public boolean isCompleted() {
    return completed;
}

public void complete() {
    this.completed = true;
}
```

마지막으로, CSV에 저장하기 편하게 하기 위한 `toCsvRow()` 메서드를 추가했다.

```java
public String toCsvRow() {
    return String.format("%s,%s,%s", title, dueDate, completed);
}
```

### `Todo` 데이터 관리 - `TodoRepository`

데이터를 파일로 읽고 쓰고를 담당하기 위한 클래스를 `TodoRepository`로 별도로 만들었다.
여기에는 실제 데이터를 담는 리스트와 사용할 파일이름을 담는 속성을 만들었다.
이들은 한번 설정되면 변경될 일이 없기 때문에 `final`을 추가했다.

```java
private final List<Todo> todos;
private final String filename;
```

생성자의 경우 파일명을 인자로 받는 생성자와, 기본 파일명을 사용하도록 만들어진 기본 생성자 두개를 만들었다.
`Todo` 때와 마찬가지로 `this()`를 이용해 실제 기능은 하나의 생성자에만 만들었다.
또한 실제로 데이터를 리스트에 할당하는 `readFromFile()` 메서드를 내부에서 호출하여,
클래스가 객체로 만들어지는 시점에 자동으로 파일의 데이터로 리스트에 데이터를 추가해준다.

```java
public TodoRepository() {
    this("todo.csv");
}

public TodoRepository(String filename) {
    this.filename = filename;
    this.todos = new ArrayList<>();
    try {
        this.readFromFile();
    } catch (FileNotFoundException e) {
        System.out.println("File not found, if there are new todo's it will be created");
    } catch (IOException e) {
        System.err.println("Error while reading file");
        throw new RuntimeException(e);
    }
}
```

`readFromFile`의 경우 생성자에서 호출할 경우 굳이 외부에서 다시 호출할 이유가 없기 때문에 `private`으로 만들었다.
`try-with-resource`를 이용했으며, 메서드 자체에선 `throws`를 이용해서 `IOException` 예외는 외부에서 처리.
이는 생성자에서 `RuntimeException`으로 변환해서 다시 발생시킨다. 문제가 발생할 시 애플리케이션의 실행을 막기 위함이다.
`FileNotFoundException`의 경우 파일이 없어서 일어나는 예외이며, 이 경우 애플리케이션이 종료될 때 자동으로 생성됨으로 내부에서 처리한다.

```java
private void readFromFile() throws IOException {
    try (FileReader fileReader = new FileReader(filename);
         BufferedReader reader = new BufferedReader(fileReader)) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] values = line.split(",");
            todos.add(new Todo(
                    values[0],
                    LocalDate.parse(values[1]),
                    Boolean.parseBoolean(values[2])
            ));
        }
    }
}
```

`writeFromFile`도 마찬가지로 `IOException`의 경우 `throws`로 외부에서 처리하며,
이는 `main`에서도 `throws`로 처리한다. 파일 쓰기 오류는 당장은 신경쓰지 않는다.
파일을 작성할 때는 `Todo::toCsvRow`가 있어서 코드가 간단하게 마무리된다.

```java
public void writeToFile() throws IOException {
    try (FileWriter fileWriter = new FileWriter(filename);
         BufferedWriter writer = new BufferedWriter(fileWriter)) {
        for (Todo todo : todos) {
            writer.write(todo.toCsvRow());
            writer.newLine();
        }
    }
}
```

마지막으로 읽어들인 리스트를 반환하는 `getTodos()`를 만들었다.

```java
public List<Todo> getTodos() {
    return todos;
}
```

### 기능 실행 주체 - `TodoService`

`TodoService`에는 실제 `Todo` 데이터를 추가 및 변경하기 위한 기능들을 만들었다.
`System.in`을 사용하는 입력 처리 클래스는 하나만 사용해야 하기 때문에 `Main`에서 `BufferedReader`를 받아서 사용하도록,
데이터가 담겨있는 `List`와 함께 받아오도록 만들었다.
또한 데이터를 받아오면서 리스트를 정리했다.

```java
private final BufferedReader reader;
private final List<Todo> todos;

public TodoService(BufferedReader reader, List<Todo> todos) {
    this.reader = reader;
    this.todos = todos;
    this.sortTodos();
}
```

리스트를 정리하는 `sortTodos()`는 간단하게 `Comparator.comparing()`을 사용했다.

```java
private void sortTodos() {
    this.todos.sort(Comparator.comparing(Todo::getDueDate));
}
```

기능에서 "수정, 완료, 삭제" 기능의 경우 index(숫자)를 입력해야 하고,
"생성, 수정"의 경우 날짜를 입력하여야 하며,

> 사용자가 입력한 내용이 허용되지 않은 내용(숫자 입력할 때 다른 입력, 잘못된 날짜 입력 등)이라면, 해당 메시지를 보여주고 이전 메시지를 다시 출력해준다.

요구사항이 존재하기 때문에, `while`과 `try - catch`가 복수번 사용된다.
이부분을 별도로 메서드로 만들었다.

`autoRetryIndex(String prompt)`의 경우 반드시 정상적인 정수를 반환해야 한다.
`prompt`는 출력할 안내문구를 전달한다.
`IOException`은 외부에서 처리한다.

```java
private int autoRetryIndex(String prompt) throws IOException {
    int id;
    while (true) {
        try {
            System.out.print(prompt);
            id = Integer.parseInt(reader.readLine()) - 1;
            break;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, input a integer");
        }
    }
    return id;
}
```

`autoRetryUntil(boolean allowEmpty)`의 경우 "수정" 기능에서 입력하지 않을 수도 있기 때문에, 입력 안해도 되는지 여부를 인자로 받는다.
`true`일 경우 입력이 비엇을 경우 데이터를 `LocalDate`로 변환하려고 시도하지 않고 `Optional.empty()`를,
`false`일 경우 입력이 비엇을 경우 재시도 메시지를 출력한다.

```java
private Optional<LocalDate> autoRetryUntil(boolean allowEmpty) throws IOException {
    while (true) {
        // 예외 발생할 경우 잡아줄 try - catch
        try {
            System.out.print("Until: ");
            String untilString = reader.readLine();
            // 입력이 있다면
            if (!untilString.isEmpty()) {
                // 입력이 정상이라면 Optional.of();
                return Optional.of(LocalDate.parse(untilString));
            }
            // 아니라면 Optional.empty();
            else if(allowEmpty) return Optional.empty();
            System.out.println("No input, try again");
        } catch (DateTimeParseException e) {
            // 예외가 발생하면 return에 도달하지 못한다.
            System.out.println("Invalid date format, try again");
        }
    }
}
```

이는 TODO 생성에서는 `false`로 호출하며, 결과의 `orElseThrow()`를 사용한다.
이는 실제로 데이터가 없는 경우 메서드가 잘못만들어진 것이기 때문에 예외를 발생시켜 개발자에게 알려야 하기 때문이다.

```java
public void createTodo() throws IOException {
    System.out.print("Title: ");
    String title = reader.readLine();
    LocalDate dueDate = autoRetryUntil(false).orElseThrow();
    todos.add(new Todo(title, dueDate));
    sortTodos();
    System.out.println("Saved!!!\n");
}
```

TODO 수정에서는 빈 입력이 허용되므로, 결과의 `isPresent()`를 기준으로 활용한다.
수정하는 과정에는 입력이 없을 경우 수정할 필요가 없기 때문이다.

```java
public void editTodo() throws IOException {
    // 수정할 대상 찾기
    int id = autoRetryIndex("Edit TODO number: ");
    // 해당 번호 없음
    if (!(id < todos.size())) {
        System.out.println("No TODO by that number");
        System.out.println();
        return;
    }
    // 수정할 대상 정하고
    Todo todo = todos.get(id);
    // 제목 입력받기
    System.out.print("Title: ");
    String title = reader.readLine();
    // 비어있지 않으면 설정
    if (!title.isBlank()) todo.setTitle(title);
    // 날짜 입력받기
    Optional<LocalDate> until = autoRetryUntil(true);
    // 비어있지 않으면 설정
    if (until.isPresent()) todo.setDueDate(until.get());
    // until.ifPresent(todo::setDueDate); 로도 가능
    // 수정된 결과를 바탕으로 재정렬
    sortTodos();
    System.out.println("Saved!!!\n");
}
```

TODO 완료, 삭제는 index만 사용하면 된다.

```java
public void finishTodo() throws IOException {
    // 완료할 대상 찾기
    int id = autoRetryIndex("Finish TODO number: ");
    // 해당 번호 없음
    if (!(id < todos.size())) {
        System.out.println("No TODO by that number");
        System.out.println();
        return;
    }

    // 완료할 대상 정하고
    Todo todo = todos.get(id);
    // 완료
    todo.complete();
}

public void deleteTodo() throws IOException {
    // 삭제할 대상 찾기
    int id = autoRetryIndex("Delete TODO number: ");
    // 해당 번호 없음
    if (!(id < todos.size())) {
        System.out.println("No TODO by that number");
        System.out.println();
        return;
    }
    // 리스트에서 해당 할일 제거
    todos.remove(id);
}
```

### 기능 선택 - `Main`

실제로 애플리케이션의 기능을 실행하는 주체는 `Main`이다.
여기서 기본 첫화면 출력, `TodoRepository`, `TodoService`를 객체로 만들며,
사용자의 입력에 따라 `TodoService`의 기능을 실행해준다.

첫화면 출력은 여러 `System.out.println`으로 이뤄져 있다.
이때, 남은 TODO 갯수 출력을 위해 미완료 TODO 갯수를 Stream으로 확인했다.

```java
private static void printFirstScreen() {
    System.out.println("Welcome!!!\n");
    // 남은 할일 갯수 세기
    int todosLeft = todos.stream()
            .filter(todo -> !todo.isCompleted())
            .mapToInt(todo -> 1)
            .sum();
    
    // 갯수에 따라 다른 출력 만들기
    switch (todosLeft) {
        case 0 -> System.out.println("You have no more TODOs left!!!");
        case 1 -> System.out.println("You have 1 TODO left.\n");
        default -> System.out.println("You have " + todosLeft + " TODOs left.\n");
    }

    // 각 TODO를 한번에 출력하기 위한 StringBuilder
    StringBuilder todoBuilder = new StringBuilder();
    for (int i = 0; i < todos.size(); i++) {
        Todo todo = todos.get(i);
        if (todo.isCompleted() && todo.getDueDate().isBefore(LocalDate.now())) continue;
        todoBuilder.append(i + 1).append(". ");
        todoBuilder.append(todo.getTitle());
        if (todo.isCompleted()) todoBuilder.append(" (Done)");
        todoBuilder.append('\n');
    }
    System.out.println(todoBuilder);
    // 선택지 출력
    System.out.println("1. Create TODO");
    System.out.println("2. Edit TODO");
    System.out.println("3. Finish TODO");
    System.out.println("4. Delete TODO");
    System.out.println("5. Exit");
    System.out.println();
}
```

`main`의 첫부분은 `BufferedReader`, `TodoRepository`, `TodoService`를 만든다.
`TodoRepository`를 만들어서 데이터를 읽어서 `TodoService`를 만들때 사용한다.
실제 TODO 리스트는 정적 속성으로 만들어서 `main`, `printFirstScreen` 둘다 사용할 수 있도록 만들었다.

```java
private static List<Todo> todos;
public static void main(String[] args) throws IOException {
    // 사용자 입력 받기용
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    // 데이터 관리용
    TodoRepository repository = new TodoRepository();
    todos = repository.getTodos();
    // 실제 기능
    TodoService service = new TodoService(reader, repository.getTodos());
    // ...
```

사용자 입력은 `while`을 사용한다.
종료를 뜻하는 `5`를 먼저 `if`로 처리, 나머지는 `switch`를 활용했다.
`switch` 내부에서는 `break`를 활용하기 어렵기 때문에, 반복문을 종료하는 `break`만 따로 사용하기 위해서이다.

```java
private static List<Todo> todos;
public static void main(String[] args) throws IOException {
    // ...
    while (true) {
        // 첫화면 출력
        printFirstScreen();
        // 입력 안내
        System.out.print("Input: ");
        int selection;
        try {
          // 선택을 입력하다
          selection = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
          // 숫자가 아니면 `continue`로 다시 반복의 처음으로
          System.out.println("Input must be an integer (1 ~ 5)");
          continue;
        }
        // `5`의 경우 `break` (종료)
        if (selection == 5) break;
        // 그 외는 `switch - case - default`
        switch (selection) {
            case 1 -> service.createTodo();
            case 2 -> service.editTodo();
            case 3 -> service.finishTodo();
            case 4 -> service.deleteTodo();
            default -> System.out.println("Invalid selection, select from 1 to 5");
        }
    }
    
    // ...
```

마지막으로 종료 전에 `writeToFile()`을 호출한다.
오류가 발생하면 출력하고, 비정상 종료를 위해 `RuntimeException`을 발생시킨다.

```java
public static void main(String[] args) throws IOException {
    // ...
  
    try {
        repository.writeToFile();
    } catch (IOException e) {
        System.err.println(e.getMessage());
        throw new RuntimeException(e);
    }
}
```

