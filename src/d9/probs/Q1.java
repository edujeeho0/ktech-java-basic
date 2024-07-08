package d9.probs;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
정수 배열을 인자로 받아,
각 숫자를 제곱한 수들의 합을 구하는 메서드를,
Stream API를 활용해 작성하시오.
 */
public class Q1 {
    public static void main(String[] args) {
        System.out.println(sumOfSquares(new int[]{1, 2, 3, 4, 5}));
        System.out.println(sumOfSquares(new int[]{-2, -4, 6}));
    }

    public static int sumOfSquares(int[] numbers) {
//        int sum = 0;
//        for (int num : numbers) {
//            sum += num * num;
//        }

//        // 정수의 Stream을 만들자.
//        IntStream numStream = Arrays.stream(numbers);
//        // 각 정수를 제곱한다. (^2)
//        IntStream numStream2 = numStream.map(i -> i * i);
//        // 각 정수의 합을 반환한다.
//        return numStream2.sum();

        // Stream에 익숙해지면 코드가 매우 간단해진다.
        return Arrays.stream(numbers)
                .map(i -> i * i)
                .sum();

//        return Arrays.stream(numbers)
//                .reduce(0, (prev, now) -> prev + now * now);
    }
}
