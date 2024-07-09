package d9.probs;

import java.util.Arrays;

/*
공백 문자로 구분된 정수들이 담긴 문자열이 있다. 아래는 그 예시이다.

"1 2 3 4 5"

이러한 문자열을 인자로 받아,
해당하는 정수들로 이뤄진 배열을 반환하는 메서드를,
Stream API를 활용해 작성하시오.
 */
public class Qb {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(parseToIntArr(
                "1 2 3 4 5")));
        System.out.println(Arrays.toString(parseToIntArr(
                "12 34")));
        System.out.println(Arrays.toString(parseToIntArr(
                "100 500 10000")));
    }

    public static int[] parseToIntArr(String numString) {
        // 일단 문자열을 ' ' 기준으로 나눈 다음 Stream을 만든다.
        return Arrays.stream(numString.split(" "))
                // 각 문자열을 정수로 변환
                .mapToInt(Integer::parseInt)
//                .mapToInt(str -> Integer.parseInt(str))
                // 배열로 모으기
                .toArray();
    }
}
