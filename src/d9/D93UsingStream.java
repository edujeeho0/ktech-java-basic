package d9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
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

        // 중간 작업: 데이터를 정렬하자.
        // sorted()
        // Stream의 데이터를 정렬한 새로운 Stream
        Stream<String> nameStream3 = nameStream2
                .sorted();
//        nameStream3.forEach(System.out::println);

        // sorted(Compartor)
        // Comparator를 사용해 데이터를 정렬한 새로운 Stream
        // Comparator => 두개의 인자를 받아 어떤게 더 큰지를 정수로 반환하는
        //               FunctionalInterface
        Stream<String> nameStream4 = nameStream3
                .sorted((name1, name2) -> -name1.compareTo(name2));
//        nameStream4.forEach(System.out::println);

        // 3. Terminal Operations
        //    최종 작업: Stream의 데이터를 마지막으로 사용

        // forEach(Consumer) -> 인자는 받는데, 반환은 없는 함수형 인터페이스를 받는다.
        // 남은 원소들을 대상으로 코드를 실행하고 종료.
        /*nameStream4.forEach(name -> {
            System.out.println(String.format("Hello, %s!!!", name));
            System.out.println("Your name's length is: " + name.length());
            // 데이터를 돌려주는 용도로는 못쓴다.
            // return 0;
        });*/

        // toArray()
        // 남은 원소들을 가지고 새로운 배열을 만들고 종료.
        // (원시 타입에 좀더 유리)
        /*List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        int[] intArray = integerList.stream()
                .mapToInt(i -> i)
                .toArray();
        System.out.println(Arrays.toString(intArray));*/

        // toList()
        // 리스트로 모으기
        /*List<String> newNameList = nameStream4
                .toList();*/

        /*List<String> newNameList = new ArrayList<>();
        nameStream4.forEach(name -> {
            newNameList.add(name);
        });*/

        // count()
        // Stream에 남아있는 데이터를 센다.
        /*System.out.println(nameStream4.count());*/

        // allMatch, anyMatch, noneMatch
        // 복수의 원소를 대상으로 일치 여부를 판단하고 싶을 때

        // allMatch(Predicate)
        // Stream의 남은 모든 원소가 Predicate의 결과가 true이면 true
//        System.out.println(nameStream4.
//                allMatch(name -> name.contains("A")));
        // anyMatch(Predicate)
        // Stream의 남은 원소 중 하나라도
//        System.out.println(nameStream4.
//                anyMatch("name -> name.contains("R)));
        // noneMatch(Predicate)
        // Stream 남은 원소 아무것도
//        System.out.println(nameStream4
//                .noneMatch(name -> name.contains("Z")));

        // IntStream, LongStream, DoubleStream
        int[] numbers = {1, 23, 45, 6, 7, 89};
        IntStream numStream = Arrays.stream(numbers);
        // sum()
        // System.out.println(numStream.sum());
        // min, max, average
//        System.out.println(numStream.min());
//        System.out.println(numStream.max());
        System.out.println(numStream.average().getAsDouble());
    }
}
