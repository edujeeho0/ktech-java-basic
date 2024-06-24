package d2.prob;

import java.util.Scanner;

/*
세개의 양의 정수 A, B, C를 입력받아서,
A가 B와 C의 공배수인지를 true 또는 false로 출력하여라.
 */
public class Qe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // A가 B의 배수인지?
        boolean isAB = a % b == 0;
        // A가 C의 배수인지?
        boolean isAC = a % c == 0;
        // A가 B와 C의 공배수인지?
        // => B의 배수이면서 C의 배수인지?
        boolean isCommonMultiple = isAB && isAC;
        System.out.println(isCommonMultiple);
    }
}
