package d3.prob;

import java.util.Scanner;

/*
정수 N이 입력된 뒤, N개의 정수가 입력된다. 그 값들의 평균을 실수 범위에서 구하여라.
 */
public class Qd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 몇개의 데이터가 들어올지
        int n = scanner.nextInt();
        // 값을 합하기 위한 sum
        int sum = 0;
        // n개의 데이터를 입력 받자.
        for (int i = 0; i < n; i++) {
            // 입력된 데이터를 바로 sum에 더해준다.
            sum += scanner.nextInt();
        }
        System.out.println((double) sum / n);
    }
}
