package d8.q4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
엔터로 구분된 입력이 임의의 횟수만큼 이뤄진다.
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력한 정수가 몇가지가 되는지와 그 총합을 출력하시오.

힌트: Integer.parseInt 메서드는 정수로 표현 불가능한 문자열에 대해 NumberFormatException을 발생시킨다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> integerSet = new HashSet<>();
        while (true) {
            String inputLine = scanner.nextLine();
            if (inputLine.equals("q")) {
                break;
            }
            try {
                integerSet.add(Integer.parseInt(inputLine));
            } catch (NumberFormatException ignored) {}
        }
        int sum = 0;
        for (int inputValue: integerSet) {
            sum += inputValue;
        }
        System.out.println(integerSet.size());
        System.out.println(sum);
    }
}
