package d9;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D92Stream {
    public static void main(String[] args) {
        // Stream이란 데이터의 흐름
        // 그리고 그 데이터에 적용할 메서드를
        // 전달할 수 있게 해주는 객체
        Stream<String> stream;

        // 배열을 stream으로 변환하기
        String[] nameArray = { "eric", "alex", "dave", "chad", "brad" };
        // Arrays.stream()
        Stream<String> strStream = Arrays.stream(nameArray);
        strStream.forEach(System.out::println);

        // 원시타입은 <T>로 못쓰니까
        // 별도의 Stream 클래스가 존재
        int[] numbers = {1, 23, 14, 53, 22, 15, 10, 6};
        IntStream intStream = Arrays.stream(numbers);
        intStream.forEach(System.out::println);
        // LongStream, DoubleStream 존재

        // 아쉽게도 BooleanStream은 없다....
        Boolean[] bools = { true, false, true };
        Stream<Boolean> boolStream = Arrays.stream(bools);

        // CharStream도 없다...
        // 대신 문자열의 chars() 메서드가 char -> int로 바꿔서 Stream으로 만들어준다.
        IntStream charStream = "edujeeho@gmail.com".chars();
//        charStream.forEach(System.out::println);
        charStream.forEach(c -> System.out.println((char) c));

        // Collection.stream()으로 Stream을 만든다.
        List<String> nameList = new ArrayList<>();
        nameList.add("Alex");
        nameList.add("Dave");
        nameList.add("Chad");
        nameList.add("Brad");
        Stream<String> listStream = nameList.stream();

        Set<String> nameSet = new HashSet<>(nameList);
        Stream<String> setStream = nameSet.stream();
    }
}
