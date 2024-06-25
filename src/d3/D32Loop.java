package d3;

import java.util.Scanner;

public class D32Loop {
    public static void main(String[] args) {
        // while
        // 대출금을 갚자
        int loan = 1000;
        // 매달 갚을 금액
        int monthly = 50;
        // 몇달 걸렸는지
        int months = 0;
        // if는 내부의 조건이 true 일때 실행
        // while은 내부의 조건이 true 일동안 실행
        while (loan > 0) {
            // while 내부에서도 if, else if, else 가능
            if (loan < monthly) {
                loan = 0;
            }
            else {
                loan -= monthly;
                loan *= 1.03;
            }
            System.out.println(String.format("Remaining: %d", loan));
            months++;  // months = months + 1;
        }
        System.out.println(months);
        System.out.println(loan);

        // 로그인 횟수를 세가며 반복 해보자.
        Scanner scanner = new Scanner(System.in);
        // 맞춰야 되는 비밀번호
        int password = 1234;
        // 시도한 횟수를 기록하는 정수 변수
        int tries = 0;
        while (!(tries > -1)) {
            // 사용자가 비밀번호를 입력한다.
            System.out.print("Input Password: ");
            int input = scanner.nextInt();
            if (password == input) {
                // 나중에 넣어보기
            }
            tries++;
        }
        System.out.println("Failed to login");

        // for
        // 몇번 반복해서 실행할 코드를 좀더 편하게 하려면?
        int count = 0;
        while (count < 5) {
            System.out.println(count);
            count++;
        }
        // (시작하는 조건; 끝나는 조건; 한번마다 실행할 코드)
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }
        System.out.println("끝");

        // intellij에서 fori + TAB
        for (int i = 0; i < 10; i++) {
            System.out.println("i ^ 2: " + (i * i));
        }

        /*// for의 각 부분은 생략 가능하다...................
        for (;;) {
            System.out.println("loop forever");
        }*/
    }
}
