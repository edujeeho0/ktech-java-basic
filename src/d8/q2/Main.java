package d8.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
엔터로 구분된 정수 입력이 임의의 횟수만큼 이뤄진다. (잘못된 입력은 주어지지 않는다.)
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
입력된 정수중 3의 배수만 골라 총합을 구하여라.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        while (true) {
            // 입력받기
            String input = scanner.nextLine();
            // q가 입력되면 반복종료
            if (input.equals("q")) {
                break;
            }
            // 정수로 변환하고,
            int inputValue = Integer.parseInt(input);
            if (inputValue % 3 == 0) {
                // 3의 배수니까, 넣어주자.
                inputList.add(inputValue);
            }
        }
        // 합을 위한 변수
        int sum = 0;
        for (int value: inputList) {
            // 더해준다.
            sum += value;
        }
        System.out.println(sum);
    }
}
