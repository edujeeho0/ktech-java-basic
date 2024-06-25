package d3.prob;

import java.util.Scanner;

/*
한 사람의 체온이 정수로 입력되고,
체온이 38도 이상이면 추가로 증상을 문자열로 입력받는다.
이후 입력받은 정보를 한줄에 출력한다.

- 체온만 입력되었을 경우 `체온`의 형태로 출력한다.
- 체온과 증상이 입력되었을 경우 `체온, 증상`의 형태로 출력한다.
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 일단 체온을 입력받자.
        int temperature = scanner.nextInt();
        // 다음줄로 넘어가기
        scanner.nextLine();
        if (temperature >= 38) {
            // 증상 받기
            String sym = scanner.nextLine();
            System.out.println(String.format("%d, %s", temperature, sym));
        }
        else  {
            System.out.println(temperature);
        }
    }
}
