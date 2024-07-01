package d5.probs;

/*
두 정수(int)를 인자로 받아, 두 정수 값의 차이(int)의 절대값을 반환하는 메서드 diff를 작성하시오.
 */
public class Q0 {
    public static void main(String[] args) {
        int a = -10;
        int b = 1020;
        System.out.println(diff(a, b));  // 10
    }

    public static int diff(int a, int b) {
        int subtract = a - b;
        if (subtract < 0) return -subtract;
        return subtract;
    }
}
