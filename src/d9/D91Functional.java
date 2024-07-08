package d9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D91Functional {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("dave");
        nameList.add("chad");
        nameList.add("eric");
        nameList.add("brad");
        nameList.add("alex");

        // 이 이름들 중 a가 포함된 이름만 따로 List로 모아주세요
        // 그리고 정렬도 해주세요
        // 1. 걸러진 이름들을 저장할 List를 만든다.
        List<String> namesWithA = new ArrayList<>();
        // 2. for 반복을 통해 각 이름에 a가 있는지 contains()로 확인한다.
        for (String name : nameList) {
            if (name.contains("e")) {
                namesWithA.add(name);
            }
        }
        // 3. 정렬한다. (Collections.sort(), List.sort())
        Collections.sort(namesWithA);
        // 4. 출력한다.
        System.out.println(namesWithA);

        // Stream API
        // 1. 걸러진 이름들을 저장할 List를 만든다.
        List<String> namesWithStream = nameList.stream()
                // 2. 각 이름에 a가 있는지 contains()로 확인한다.
                .filter(name -> name.contains("e"))
                // 3. 정렬한다.
                .sorted()
                .toList();
        // 4. 출력한다.
        System.out.println(namesWithStream);

        // 원래 방식
        // interface를 구현하는 클래스를 직접 만들어서 전달
        NoArgRetFunction function = new FunctionImpl();
        useFunction(function);
        // 익명 내부 클래스
        // 한번만 사용할 클래스를 굳이 다른 파일에 쓰지 않고
        // 사용할 곳에서 바로 만들어서 사용하는 방식
        useFunction(new NoArgRetFunction() {
            @Override
            public void noArgReturn() {
                System.out.println("익명 내부 클래스");
            }
        });

        // 람다 표현식
        // interface의 하나 있는 메서드를 표현하는 방법
        useFunction(() -> System.out.println("lambda"));
        // () -> System.out.println("lambda") => 메서드다!
        NoArgRetFunction lambda = () -> System.out.println("lambda!!");
        useFunction(lambda);
        lambda = () -> {
            System.out.println("Hello Lambda!");
            System.out.println("multiline lambda!");
        };
        useFunction(lambda);

        nameList.stream()
                // name이라는 매개변수를 가지고, name이 "e"를 포함하는지
                // 반환하는 메서드
                .filter(name -> name.contains("e"))
                .toList();

        System.out.println("before string function");
        useStringFunction(str -> {
            System.out.println("inside lambda");
            int count = 0;
            for (char a: str.toCharArray()) {
                if (a == 'm') count++;
            }
            return count;
        });

        // 메서드 직접 참조 (::)
        // String 안에 정의된 length 메서드를 전달한다.
        useStringFunction(String::length);
    }

    public static void useStringFunction(
            StringArgFunction function
    ) {
        System.out.println("inside function");
        System.out.println(function.run("lorem ipsum"));
    }

    public static void useFunction(
            NoArgRetFunction function
    ) {
        function.noArgReturn();
    }
}
