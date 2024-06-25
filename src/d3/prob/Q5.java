package d3.prob;

import java.util.Scanner;

/*
5개의 정수가 입력된다. 이중 최대값을 구해서 출력하여라.
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 데이터를 담아둘 배열(Array)
        int[] nums = new int[5];
        /*
        nums[0] = scanner.nextInt();
        nums[1] = scanner.nextInt();
        // ...
         */
        // while문으로 입력받기
        int count = 0;
        while (count < 5) {
            nums[count] = scanner.nextInt();
            count++;
        }
        /*// for문으로 입력받기
        for (int i = 0; i < 5; i++) {
            nums[i] = scanner.nextInt();
        }*/

        // 반복해서 비교하기
        int max = nums[0];
        for (int i = 0; i < 5; i++) {
            // 3항 연산자
            max = nums[i] > max ? nums[i] : max;
        }
        System.out.println(max);

        // 더 해보기
        // 배열을 만들지 않고 최댓값 구해보기
    }
}
