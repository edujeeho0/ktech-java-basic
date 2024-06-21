package d1.probs;

import java.util.Scanner;

/*
"오전" 또는 "오후"를 입력받은 뒤, 0 ~ 11 사이의 정수(X)를 입력받아
오전 X시
의 형식으로 출력하는 코드를 작성하시오.
 */
public class Qe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String amPm = scanner.nextLine();
        int hour = scanner.nextInt();
        System.out.println(String.format("%s %d시", amPm, hour));
    }
}
/*
오전
11
 */
/*
오전 11시
 */