package d5.probs;

/*
현재 오전 7시이다.

정수 n을 인자로 받아서,
n 시간 후 12시까지 표기된 시계에서 시침이 어떤 숫자 위에 있는지를
반환하는 메서드를 작성하시오.

단, 12시에 위치할 경우 0으로, 입력이 0 <= n <= 127 를 벗어나면 -1을 반환하시오.
 */
public class Qa {
    public static void main(String[] args) {
        System.out.println(whereHour(12));
    }

    public static int whereHour(int n) {
        // 입력이 0 <= n <= 127 를 벗어나면 -1
        if (n < 0 || n > 127) return -1;
        // 현재 오전 7시이다.
        int current = 7;
        int hour = (current + n) % 12;
        return hour;
    }
}
