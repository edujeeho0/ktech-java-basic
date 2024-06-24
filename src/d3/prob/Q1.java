package d3.prob;


import java.util.Scanner;

/*
정수 n을 입력받아
5의 배수면서 2의 배수인지, 5의 배수인지, 2의 배수인지, 아니면 아무 숫자의 배수도 아닌지
출력하는 프로그램을 작성하시오.
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 10의 배수인지 판단하려면?
        if (n % 10 == 0) {
            System.out.println("multiple of 10");
        }
        // 5의 배수인지 판단하려면?
        else if (n % 5 == 0) {
            System.out.println("multiple of 5");
        }
        // 2의 배수인지 판단하려면?
        else if (n % 2 == 0) {
            System.out.println("mutliple of 2");
        }
        // 다 아닐때는?
        else {
            System.out.println("not multiple of 10 nor 5 nor 2");
        }
    }
}
