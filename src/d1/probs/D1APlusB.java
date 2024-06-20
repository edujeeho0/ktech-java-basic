package d1.probs;

import java.util.Scanner;

public class D1APlusB {
    public static void main(String[] args) {
        // 사용자한테 A를 입력받고, B를 입력받으면
        // A + B를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        System.out.print("A를 입력하세요: ");
        int inputA = scanner.nextInt();
        System.out.print("B를 입력하세요: ");
        int inputB = scanner.nextInt();
        System.out.print("A + B = ");
        System.out.println(inputA + inputB);
    }
}
