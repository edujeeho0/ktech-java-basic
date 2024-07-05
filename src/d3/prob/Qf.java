package d3.prob;

import java.util.Scanner;

/*
3명의 사람들에 대한 정보가
개행문자로 구분된 이름(문자열)이 세번
개행문자로 구분된 체온(정수)이 세번
입력된다.
이 중 체온이 38도가 넘는 사람들의 이름을 출력하도록 한다.
*/
public class Qf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 이름을 저장해둔다.
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            names[i] = scanner.nextLine();
        }
        // 체온을 저장해둔다.
        int[] temps = new int[3];
        for (int i = 0; i < 3; i++) {
            temps[i] = scanner.nextInt();
        }

        // 저장된 정보를 바탕으로
        // 체온이 일정 값 이상이면 이름을 출력한다.
        for (int i = 0; i < 3; i++) {
            if (temps[i] >= 38) {
                System.out.println(names[i]);
            }
        }
    }
}
