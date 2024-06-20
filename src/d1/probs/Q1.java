package d1.probs;

import java.util.Scanner;

// 사용자에게 문자열 입력을 받고,
// 입력 받은 내용을 3번 출력하는 코드를 작성하시오
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 오답: 한번 입력받고 그 데이터를 사용
        // System.out.println(scanner.nextLine());

        // 오답: "안녕하세요"를 세번 출력
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");
        // System.out.println("안녕하세요");

        // 1. 사용자의 입력을 변수에 저장한다.
        String line = scanner.nextLine();
        // 2. 필요한 만큼 변수를 사용한다.
        System.out.println(line);
        System.out.println(line);
        System.out.println(line);
    }
}
