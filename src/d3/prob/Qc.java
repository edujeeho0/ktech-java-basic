package d3.prob;

import java.util.Scanner;

/*
치타는 엄청난 속도로 달리지만, 10초 밖에 달리지 못한다.
- 치타의 속도(m/s, 정수)
- 사냥감의 거리(m, 정수)
- 속도(m/s, 정수)
가 주어졌을 때 치타가 사냥에 성공하면 몇초가 걸려 잡았는지,
실패하면 "꼬르륵"을 출력하여라. 걸린 시간은 올림하여 정수로 표현한다.

단 치타와 사냥감은 같은 직선상에 움직이며, 치타와 사냥감 둘다 속도가 변하지 않는다.
 */
public class Qc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cheetah = scanner.nextInt();
        int distance = scanner.nextInt();
        int prey = scanner.nextInt();

        // 매초 줄어드는 거리
        int speedDiff = cheetah - prey;
        // 얼마나 걸릴지?
        int seconds = distance / speedDiff;
        // 나누어 떨어지지 않으면 조금 더 달려야 한다.
        if (distance % speedDiff != 0) seconds++;
        // 10초가 넘거나, 0초(사냥감이 더 빠른 경우)
        if (seconds > 10 || seconds < 0) {
            System.out.println("꼬르륵");
        }
        // 그 외
        else {
            System.out.println(seconds);
        }
    }
}
