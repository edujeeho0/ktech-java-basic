package d1.probs;


import java.util.Scanner;

// 사용자에게 소숫점으로 표현된 실수를 입력받고,
// 소숫점 4번째 자리까지 출력하시오.
public class Qd {
    public static void main(String[] args) {
        // String.format("%f")
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        System.out.println(String.format("%.4f", number));
    }
}

/*
3.141592
3.1416
 */
