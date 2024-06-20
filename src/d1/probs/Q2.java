package d1.probs;

import java.util.Scanner;

// 사용자에게 정수 두개를 입력받고,
// 입력된 순서의 반대로 출력하는 코드를 작성하시오.
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. 첫번째 정수를 저장할 변수에
        // 사용자가 입력한 정수를 저장한다.
        int a = scanner.nextInt();
        // 2. 두번째 정수를 저장할 변수에
        // 사용자가 입력한 정수를 저장한다.
        int b = scanner.nextInt();
        // 3. b에 저장된 값을 출력한다.
        System.out.println(b);
        // 4. a에 저장된 값을 출력한다.
        System.out.println(a);
    }
}
/*
10
20
 */