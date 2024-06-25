package d3.prob;

import java.util.Scanner;

/*
정수 N이 입력된 뒤, N개의 정수가 입력된다. 그 값들의 합을 구하여라.
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 몇개의 데이터가 입력될지 저장해둔 뒤
        int n = scanner.nextInt();
        /*
        // 해당 크기의 배열을 만든다.
        int[] nums = new int[n];
        // 해당 크기만큼 입력을 받는다.
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // 합을 저장할 정수
        int sum = 0;
        for (int i = 0; i < n; i++) {
            // sum = sum + nums[i];
            sum += nums[i];
        }
         */
        // 배열에 저장하지 않고 바로 계산 가능하다.
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}
/*
5  => 데이터의 갯수
--- 나머지가 실제 사용할 데이터
1
2
3
4
5

10
---
1
2
3
4
5
6
7
8
9
0
 */