package d8.q6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 메뉴 저장용 Map
        Map<String, Integer> menu = new HashMap<>();
        while (true) {
            // 입력을 받는다.
            String line = scanner.nextLine();
            // order라면 메뉴 입력을 중단한다.
            if ("order".equals(line))
                break;
            // 아니라면 메뉴 정보를 정리한다.
            String[] menuLine = line.split(" ");
            // Map에 기록한다.
            menu.put(menuLine[0], Integer.parseInt(menuLine[1]));
        }
        // 주문을 받는다.
        String order = scanner.nextLine();
        // 해당 주문의 가격을 출력.
        System.out.println(menu.get(order));
    }
}
