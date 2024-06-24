package d2.prob;

import java.util.Scanner;

/*
한개의 정수 A를 입력받아,
A^2 = B, A^4 = B^2 = C, A^8 = B^4 = C^2의 1의 자리를 순서대로 한줄씩 출력하시오.
 */
public class Qf {
    public static void main(String[] args) {
        /*
        int a = 2;
        int aSquare = a * a;
        int aSqSq = a * a * a * a;
        int aSqSqSq = a * a * a * a * a * a * a * a;

        a *= a;  // a^2
        a *= a;  // a^4
        a *= a;  // a^8 */

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        // a^2을 만든다.
        a *= a;
        // 1의 자리(% 10)을 출력한다.
        System.out.println(a % 10);
        // a^4을 만든다.
        a *= a;
        // 1의 자리를 출력한다.
        System.out.println(a % 10);
        a *= a;
        System.out.println(a % 10);
    }
}
