package d3.prob;

import java.util.Scanner;

/*
1인치(inch)는 2.54 센티미터(cm)이다. 사용자에게 정수를 두개 입력받는다.

- 첫번째 정수가 0이라면 두번째 정수는 센티미터(cm)이고,
- 첫번째 정수가 1이라면 두번째 정수는 인치(inch)이다.

센티미터는 해당 길이의 인치로, 인치는 해당 길이의 센티미터로, 소수 두번째 자리까지 출력하여라.
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 변수 이름을 봤을 때 어떤 역할인지 알 수 있는 이름을 짓자.
        int unit = scanner.nextInt();
        int length = scanner.nextInt();

        // length는 cm이었기 때문에 inch로 바꾸자
        if (unit == 0) {
            double converted = length / 2.54;
            System.out.println(String.format("%.2f", converted));
        }
        // length는 inch였기 때문에 cm으로 바꾸자
        else if (unit == 1) {
            double converted = length * 2.54;
            System.out.println(String.format("%.2f", converted));
        }
    }
}
