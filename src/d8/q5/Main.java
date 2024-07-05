package d8.q5;

import java.util.*;

/*
엔터로 구분된 누군가의 이름 입력이 임의의 횟수만큼 이뤄진다.
q가 입력되면 모든 데이터가 입력된 것이라고 생각할 때,
여태까지 입력된 이름을 중복없이 알파벳 순서데로 출력하시오.

힌트: Collections.sort를 이용하면 리스트를 정렬할 수 있다.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        List<String> names = new ArrayList<>();
        // Set으로 중복을 없에고,
        Set<String> names = new HashSet<>();
        while (true) {
            String inputLine = scanner.nextLine();
            if (inputLine.equals("q")) {
                break;
            }
            names.add(inputLine);
        }

        System.out.println(names);
        // List로 정렬을 하자.
        List<String> nameList = new ArrayList<>(names);
        Collections.sort(nameList);
        // Set<String> nameSet = new HashSet<>(names);
        for (String name: nameList) {
            System.out.println(name);
        }
    }
}
