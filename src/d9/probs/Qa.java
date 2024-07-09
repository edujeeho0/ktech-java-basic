package d9.probs;

import java.util.Arrays;

/*
정수 배열을 인자로 받아,
음수가 아닌 숫자 중 짝수인 숫자들의 평균을 구하는 메서드를,
Stream API를 활용해 작성하시오.
 */
public class Qa {
    public static void main(String[] args) {
        System.out.println(posEvenAvg(new int[]{1, 2, 3, 4, 5}));
        System.out.println(posEvenAvg(new int[]{-2, -4, 4, 6, 20}));
        System.out.println(posEvenAvg(new int[]{3, 5, 7, 9}));
    }

    public static double posEvenAvg(int[] num) {
        // Stream을 만든다.
        return Arrays.stream(num)
                // filter를 이용해서 조건에 맞는 데이터만 남긴다.
                .filter(i -> !(i < 0) && i % 2 == 0)
                // 정수 Stream이니가 average() 호출
                .average()
                // Optional이기 때문에 orElse까지
                .orElse(0.0);
    }
}
