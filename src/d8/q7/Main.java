package d8.q7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // <전공, 전공생 모음>형태이기 때문에,
        // Value는 List나 Set이 적당하다.
        Map<String, List<String>> majorMap
                = new HashMap<>();
        while (true) {
            String input = scanner.nextLine();
            // `q`가 입력시 반복(입력) 종료
            if ("q".equals(input)) break;
            // 전공과 이름으로 나눈다.
            String[] info = input.split(" ");
            // 전공을 Key로 List를 요청한다.
            List<String> majorList = majorMap.get(info[0]);
            // 만약 null이라면 아직 이 전공을 가진 학생이 없었단 뜻.
            if (majorList == null) {
                // 새 ArrayList를 만들고,
                majorList = new ArrayList<>();
                // 해당 List에 이름을 추가하고,
                majorList.add(info[1]);
                // List를 Map에 추가한다.
                majorMap.put(info[0], majorList);
            }
            // null이 아니면 이미 해당 전공을 가진 학생이 기록된 라스트가 반환된다.
            else {
                // 해당 리스트에 학생을 추가한다.
                majorList.add(info[1]);
            }
        }
        // 각 Entry 별로 반복한다.
        for (Map.Entry<String, List<String>> entry
                : majorMap.entrySet()) {
            // 전공 출력
            System.out.print(String.format("%s ", entry.getKey()));
            // 각 학생 출력
            for (String name : entry.getValue()) {
                System.out.print(String.format("%s ", name));
            }
            // 전공 정보가 다 나왔으니, 다음줄로.
            System.out.println();
        }
    }

}
