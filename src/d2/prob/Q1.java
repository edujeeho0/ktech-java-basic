package d2.prob;


import java.util.Scanner;

// 세 과목의 시험점수(int)가 입력될 때,
// 평균 점수(double)를 구하여라.
// 단, 유효자리수는 신경쓰지 않는다.
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int math = scanner.nextInt();
        int literature = scanner.nextInt();
        int geography = scanner.nextInt();
        // 1. 합한다.
        int sum = math + literature + geography;
        // 2. 평균을 구한다.
        double avg = (double) sum / 3;
        // 3. avg 출력한다.
        System.out.println(avg);
    }
}
/*
80
90
100
 */
/*
90.0
 */
