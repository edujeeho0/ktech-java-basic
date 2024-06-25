package d3.prob;

import java.util.Scanner;

/*
정수 N이 입력된 뒤, N개의 이름이 개행을 기준으로 입력된다.
N개의 이름을 입력된 순서의 반대로 출력하여라.
 */
public class Qe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // 일단 이름은 저장하자.
        String[] names = new String[n];
        // 다음줄로 넘어간 뒤...
        scanner.nextLine();

        // 1. 순서대로 저장, 거꾸로 출력
        // n번 반복한다.
        for (int i = 0; i < n; i++) {
            // i번쩨에 이름을 저장한다.
            names[i] = scanner.nextLine();
        }

        // 거꾸로 출력하는데....
        // 1-1. i = 0 부터 시작하고, names[n - i - 1]를 출력한다.
        for (int i = 0; i < n; i++) {
            System.out.println(names[n - i - 1]);
        }
        System.out.println("-------");
        // 1-2. i = n - 1 부터 시작하고, names[i]를 출력하되 한번씩 줄여준다.
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        // 2. 거꾸로 저장
        for (int i = 0; i < n; i++) {
            // 제일 뒤부터 저장하자.
            names[n - i - 1] = scanner.nextLine();
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
/*
3
alex
brad
chad
 */