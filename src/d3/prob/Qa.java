package d3.prob;

import java.util.Scanner;

/*
어떤 학생의 5과목에 대한 시험점수가 입력된다.
평균이 80점을 넘으면 "Good Job" 넘지 못하면 "Too Bad" 를 출력하여라.
 */
public class Qa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        sum += scanner.nextInt();
        sum += scanner.nextInt();
        sum += scanner.nextInt();
        sum += scanner.nextInt();
        if ((double) sum / 5 > 80) {
            System.out.println("Good Job");
        }
        else {
            System.out.println("Too Bad");
        }
    }
}
