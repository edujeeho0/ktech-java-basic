package d9.probs;

import java.util.Arrays;
import java.util.List;

/*
String으로 이뤄진 리스트 names가 있다고 가정하자.
이 리스트의 원소들을 name으로,
name의 (각 글자를 대문자로 했을 때 ASCII 코드의 값의 합 % 50)을 나이로 갖는
Person 객체의 리스트로 변환하는 메서드를,
Stream API를 사용해 작성하시오.

alex -> ALEX -> 65, 76, 69, 88
총합: 298
298 % 50: 48
 */
public class Qd {
    public static void main(String[] args) {
        toPeople(new String[]{
                "alex",
                "brad",
                "chad",
                "dave"
        }).stream().forEach(person -> {
            System.out.println(person.getName() + " " + person.getAge());
        });
    }

    public static List<Person> toPeople(String[] names) {
        return Arrays.stream(names)
                // 각 이름을 사람으로 변환을 해야 하는데,
                .map(name -> {
                    // 이름을 각 글자를 대문자로 만들고,
                    int source = name.toUpperCase()
                            // 각 글자를 바탕으로 IntStream을 만들자.
                            .chars()
                            // 그 다음 합하면 ASCII의 합이다.
                            .sum();
                    return new Person(name, source % 50);
                })
                .toList();
    }
}
