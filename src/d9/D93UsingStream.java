package d9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class D93UsingStream {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("alex");
        nameList.add("dave");
        nameList.add("eric");
        nameList.add("char");
        nameList.add("brad");
        // 1. Stream 만들기
        Stream<String> nameStream = nameList.stream();
        // 2. Intermediate Operations
        //    중간 작업들: Stream에 들어가있는 데이터들에
        //               일괄적으로 적용하는 작업을 정의하는 메서드(Operations)

        // 중간 작업: "a"가 들어간 이름만 남기자
        // filter(Predicate)
        // 전달받은 메서드의 결과가 true인 원소들 만 남기는 중간작업
        Stream<String> nameStream1 = nameStream
                // 중간 작업의 결과는 새로운 데이터로 이뤄진 Stream
                .filter(name -> name.contains("a"));
                // 그래서 다음 작업을 계속 덧붙일 수 있다.
                // .filter(name -> name.contains("e"))
                // 메서드의 결과로 다시 메서드를 호출하는 형태를
                // 메서드 체이닝(method chaining)이라고 부른다.
                // .filter(name -> name.contains("i"));
        // nameStream1.forEach(System.out::println);

        // 중간 작업: 이름을 전부 대문자로 바꾸자.
        // map(Function)
        // 전달받은 메서드의 결과를 모아 새로운 Stream을 만드는 중간작업
        Stream<String> nameStream2 = nameStream1
                .map(name -> name.toUpperCase());
        // nameStream2.forEach(System.out::println);

        // map의 결과가 자료형을 보존할 필요는 없다.
//        Stream<Integer> nameLengthStream = nameStream2
//                .map(name -> name.length());
        // nameLengthStream.forEach(System.out::println);

        // map의 결과가 int, long, double인 경우
        // mapToInt, mapToLong, mapToDouble과 같은 메서드도 있다.
//        IntStream lengthStream = nameStream2
//                .mapToInt(name -> name.length());

        // 3. Terminal Operations
        //    최종 작업: Stream의 데이터를 마지막으로 사용
    }
}
