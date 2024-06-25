package d3.prob;

import java.util.Scanner;

/*
한 정수를 입력받는다. 이 정수는 잔고이다.
이후 반복해서 인출할 돈을 정수로 계속 입력받는다.
인출한 결과를 "성공: 잔고"의 형태로 출력하고,
잔고가 부족할 경우 "잔고가 부족합니다". 라고 출력 뒤 프로그램을 종료하여라.
 */
public class Qg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bank = scanner.nextInt();
        while (true) {
            int withdraw = scanner.nextInt();
            if (withdraw > bank) {
                System.out.println("잔고가 부족합니다");
                break;
            }
            bank -= withdraw;
            System.out.println(String.format("성공: %d", bank));
        }
    }
}
