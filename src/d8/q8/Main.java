package d8.q8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Q6와 동일하게 메뉴를 받는다.
        Map<String, Integer> menu = new HashMap<>();
        while (true) {
            String line = scanner.nextLine();
            if ("order".equals(line))
                break;
            String[] menuLine = line.split(" ");
            menu.put(menuLine[0], Integer.parseInt(menuLine[1]));
        }
        // 주문받을 준비
        int total = 0;
        while (true) {
            // 주문을 받는다.
            String line = scanner.nextLine();
            // done이면 주문 종료.
            if ("done".equals(line))
                break;
            // 주문 정보를 해석한다.
            String[] menuLine = line.split(" ");
            // 몇개 시켰는지 알아본다.
            int count = Integer.parseInt(menuLine[1]);
            // 메뉴의 가격을 찾고, 주문 수량만큼 곱한 다음
            // total에 더한다.
            total += menu.get(menuLine[0]) * count;
        }
        // 결과를 출력한다.
        System.out.println(total);
    }

}
