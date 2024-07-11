package project;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TodoService {
    private final BufferedReader reader;
    private final List<Todo> todos;

    // 전달받은 BufferedReader와 List는 모두 공유된 같은 객체이다.
    public TodoService(BufferedReader reader, List<Todo> todos) {
        this.reader = reader;
        this.todos = todos;
        this.sortTodos();
    }

    public void createTodo() throws IOException {
        System.out.print("Title: ");
        String title = reader.readLine();
        LocalDate dueDate = autoRetryUntil(false).orElseThrow();
        todos.add(new Todo(title, dueDate));
        sortTodos();
        System.out.println("Saved!!!\n");
    }

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
//        until.ifPresent(todo::setDueDate);
        // 수정된 결과를 바탕으로 재정렬
        sortTodos();
        System.out.println("Saved!!!\n");
    }

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

    private void sortTodos() {
        this.todos.sort(Comparator.comparing(Todo::getDueDate));
    }

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
}
