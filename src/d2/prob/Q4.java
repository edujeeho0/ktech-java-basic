package d2.prob;

import java.util.Scanner;

// 두 정수 A와 B가 입력될 때,
// A의 세제곱이 B의 제곱보다 크면 true, 아니면 false를 출력하여라.
// A ^ 3, B ^ 2
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * a * a > b * b);
    }
}
/*
2
3
 */
/*
false
 */