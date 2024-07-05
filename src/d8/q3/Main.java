package d8.q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력한 내용중 정수만을 선별하여,
<첫번째 정수> + <두번째 정수> + ... + <마지막 정수>  = <총합>
의 형태로 출력하시오.

힌트: Integer.parseInt 메서드는 정수로 표현 불가능한 문자열에 대해 NumberFormatException을 발생시킨다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputList = new ArrayList<>();
        while (true) {
            String inputLine = scanner.nextLine();
            if (inputLine.equals("q")) {
                break;
            }
            // 정수를 저장하는 시도를 해보자.
            // 정수가 아닌 데이터가 들어오면 예외가 발생하니,
            // try catch 안에서 하자.
            try {
                inputList.add(Integer.parseInt(inputLine));
            }
            // 정수가 아니어도, 조용히 넣지 않기만 하면 된다.
            catch (NumberFormatException ignored) {}
        }
        // 총합을 구해보자.
        int sum = 0;
        String output = "";

        for (int i = 0; i < inputList.size(); i++) {
            int inputValue = inputList.get(i);
            sum += inputValue;
//            output += inputValue;
            System.out.print(inputValue);
            if (i != inputList.size() - 1) {
//                output += " + ";
                System.out.print(" + ");
            }
            else {
//                output += " = ";
                System.out.print(" = ");
            }
        }
//        output += sum;
        System.out.println(sum);
    }
}
/*
1
2
3
4
q

1 + 2 + 3 + 4 = 10
 */