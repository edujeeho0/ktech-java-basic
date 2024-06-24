package d2.prob;

import java.util.Scanner;

/*
현재 시간은 오전 7시이다. 자연수 하나를 입력받아,
그 값만큼 시간이 흐른다면 시침이 몇시 위에 있을지를 출력하시오.
단, 12시는 0으로 출력한다.
 */
public class Qb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int current = 7;
        int n = scanner.nextInt();
        // 현재 시간
        int now = n + current;
        // 14시면 2에, 17시면 5에
        // 각각 12로 나눈 나머지 위에 위치할 것이다.
        int hand = now % 12;
        System.out.println(hand);
    }
}
