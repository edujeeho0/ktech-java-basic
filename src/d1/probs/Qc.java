package d1.probs;

import java.util.Scanner;

// 사용자에게 2개의 정수를 입력받고,
// 입력받은 두 수의 곱을 출력하는 코드를 작성하시오.
public class Qc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a * b);
    }
}
