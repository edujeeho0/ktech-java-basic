package d9.probs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Person으로 이뤄진 List, people이 있다고 가정하자.
이 List의 원소 중, 이름이 a 또는 A로 시작하는 사람들의 평균 나이를 구하는 메서드를,
Stream API를 활용해 작성하시오.
 */
public class Q4 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alex", 25));
        people.add(new Person("Brad", 30));
        people.add(new Person("aron", 27));
        people.add(new Person("Adam", 22));
        people.add(new Person("adam", 35));
        System.out.println(aAvgAge(people));
    }

    public static double aAvgAge(List<Person> people) {
        return people.stream()
                // A로 시작하는 사람 모으기
                .filter(person -> {
                    String name = person.getName();
                    return name.startsWith("a") || name.startsWith("A");
                })
                // 그 사람들의 나이만 모으기
                .mapToInt(Person::getAge)
                // 그 나이들의 평균 또는 0.0 구하기
                .average().orElse(0.0);
//        Stream<Person> peopleStream = people.stream();
//        // A로 시작하는 사람만 남기기
//        peopleStream = peopleStream
//                .filter(person -> {
//                    String name = person.getName();
//                    return name.startsWith("a") || name.startsWith("A");
////                    return name.charAt(0) == 'a' || name.charAt(0) == 'A';
//                });
//
//        // 나이만 모은 Stream으로 바꾸기
//        IntStream ageStream = peopleStream.mapToInt(person -> person.getAge());
//        return ageStream.average().orElse(0.0);
    }
}
