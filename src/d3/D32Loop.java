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

        // for - each
        // 배열이 있었다.
        int[] numbers = { 1, 2, 3, 4, 5 };
        // 베열의 원소를 하나씩 가져와서 출력해보고 싶었다.
        // for문을 사용하면?
        for (int i = 0; i < numbers.length; i++) {
            // i는 0 부터 4까지 커질태니까...
            System.out.println("number: " + numbers[i]);
        }
        // 근데 여기서 i는 용도가 단 하나: 몇번째인지 나타내기 위해서
        System.out.println("---- 절취선 ----");
        // i를 쓰는 대신 배열의 원소를 하나씩 가져오자. -> for each
        for (int number : numbers) {
            // number에 numbers의 원소가 순서대로 할당된다.
            System.out.println("number: " + number);
        }
        /*for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number: " + number);
        }*/

        // 문자열 배열
        String[] names = { "alex", "brad", "chad", "dave", "eric", "fred", "greg" };
        // for each를 사용하면?
        for (String name : names) {
            System.out.println("name: " + name);
        }

        // 잔고와 매월 사용 금액이 주어질때
        // 잔고가 0이되면 멈추자
        int price = 50;
        int savings = 200;
        // 10번 반복하는 for문
        for (int i = 0; i < 10; i++) {
            // 매월 금액 차감
            savings -= price;
            if (savings - price < 0) {
                System.out.println("잔고가 부족합니다.");
                // break: 반복을 멈추고 반복문에서 나간다.
                break;
            }
        }
        System.out.println(savings);

        // 숫자 배열 중, 양수 만 합치고 싶다.
        int[] accounts = {100, 20, -40, 60, -80, 100};
        int sum = 0;
        for (int account : accounts) {
            // continue: 이번 반복을 중단하고, 다음 반복으로 넘어가자.
            // continue 이후의 남은 코드는 실행하지 않는다.
            if (account < 0) continue;
            sum += account;
        }
        System.out.println("sum: " + sum);

        // 중첩 반복에서 break 또는 continue를 사용할 때는
        // 제일 가까운 반복문만 영향을 받음
        while (true) {
            for (int i = 0; i < 10; i++) {
                while (true) {
                    // 이 break는 130번 줄의 while을 종료
                    break;
                }
                if (i > 5) {
                    // 이 break는 129번 줄의 for를 종료
                    break;
                }
            }
            break;
        }
    }
}
