package d2.prob;

import java.util.Scanner;

/*
한줄에 정수가 공백문자로 구분되어 5개가 입력된다.
첫번째 입력된 숫자에, 이후에 순서대로 입력된 숫자들을
순서데로 더하고, 빼고, 곱하고, 나눈 몫을 출력하여라.
 */
public class Qa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 5개 변수 만들고 계산하기
//        int base = scanner.nextInt();
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c = scanner.nextInt();
//        int d = scanner.nextInt();
//        System.out.println((base + a - b) * c / d);

        // base에 바로 계산하기 (=)
        int base = scanner.nextInt();
        base += scanner.nextInt();
        base -= scanner.nextInt();
        base *= scanner.nextInt();
        base /= scanner.nextInt();
        System.out.println(base);
    }
}











