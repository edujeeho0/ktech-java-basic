package d9.probs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
사람들의 이름으로 구성된 문자열들이 여러번 입력된다.
이들은 이름만 있을 수도, 성도 같이 있을 수도 있다. 아래는 그 예시이다.

Alex Rodriguez
Brad
Chad Bradford
Dave

입력된 이름 중 (이름과 성이 모두 입력된 이름)만 알파벳 순으로 정렬하는 메서드를,
Stream API를 활용해 작성하시오
 */
public class Q3 {
    public static void main(String[] args) {
//        System.out.println("A R".split(" ").length);
//        System.out.println("A".split(" ").length);
        String[] names = {
                "Dave",
                "Chad Bradford",
                "Alex Rodriguez",
                "Brad",
                "Adam Smith"
        };
        System.out.println(filterFullNames(names));
    }

    public static List<String> filterFullNames(String[] names) {
        return Arrays.stream(names)
                .filter(name -> name.split(" ").length > 1)
                .sorted()
                .toList();

//        Stream<String> nameStream = Arrays.stream(names);
//        nameStream = nameStream.filter(name -> {
//            // 이름을 분리하여, 몇다어인지 새본다.
//            int length = name.split(" ").length;
//            // 길이가 1보다 큰지 확인한다.
//            return length > 1;
//        });
//        nameStream = nameStream.sorted();
//        return nameStream.toList();
    }
}
