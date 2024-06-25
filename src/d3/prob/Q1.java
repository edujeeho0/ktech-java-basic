package d3.prob;

import java.util.Scanner;

/*
한 정수를 입력받아,
해당 정수가
- 음수면 `negative`,
- 양수면 `positive`,
- 0이면 `0`을
출력하는 코드를 작성하여라.
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("negative");
        }
        else if (n > 0) {
            System.out.println("positive");
        }
        else {
            System.out.println(0);
        }
    }
}
