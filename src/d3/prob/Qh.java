package d3.prob;

import java.util.Scanner;

/*
한 정수를 입력받는다.
이후 이 정수를 거듭제곱(pow)하며 1의 자리를 확인하면서,
몇번 거듭제곱 했을 때 다시 원래의 숫자의 1의 자리랑 일치하는지 출력하여라.
한번만 거듭제곱해도 본래 숫자가 되면 결과는 1이다.
 */
public class Qh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // n의 1의 자리를 찾아보자.
        int base = n % 10;
        // base는 첫 숫자를 기록하기 위한 용도
        // now는 반복해서 곱하면서 변하는걸 확인하는 요도
        int now = base;
        int count = 0;
        while (true) {
            // 한번 pow 하고
            now *= base;
            // 1의 자리를 찾는다.
            now %= 10;
            // i를 한번 증가한다.
            count++;
            // 현재 숫자가 원래 숫자와 같아졌으면,
            if (now == base) {
                // 반복 종료
                break;
            }
        }
        System.out.println(count);
    }
}
/*
2 -> 4
2 -> 4 -> 8 -> 16 -> 32
 */

/*
3 ->
3 -> 9 -> 27 -> 81 -> 243
 */
