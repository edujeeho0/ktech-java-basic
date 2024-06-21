package d2.prob;

import java.util.Scanner;

/*
두 수 A와 B가 입력된다. A를 B로 나눈 몫과 나머지를,
A = 몫 * B + 나머지
의 형태로 출력하여라.
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int div = a / b;
        int mod = a % b;
        System.out.println("A = " + div +  " * B + " + mod);
    }
}
/*
10
3
 */
/*
A = 3 * B + 1
 */