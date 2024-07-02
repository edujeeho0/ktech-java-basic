package d5.probs;

/*
사칙연산을 나타내는 문자(char) (+, -, *, /) 하나와 두개의 정수를 입력받아,
각 기호에 대응하는 연산의 결과를 반환하는 메서드를 작성하시오.

단, 정수 범위에서만 결과를 반환합니다.
 */
public class Q3 {
    public static void main(String[] args) {
        System.out.println(calculate('*', 10, 20));
    }

    public static int calculate(char operator, int left, int right) {
        // 특정 변수의 값이 일치하는지를 기준으로 실행하는 조건문
        switch (operator) {
            case '+':
                return left + right;
            case '-':
                return left - right;
            case '*':
                return left * right;
            case '/':
                return left / right;
            // 정해지지 않은 명령에 대해서는
            // 정상적이지 않다는 의미로
            // 제일 작은 Integer를 돌려주자.
            default:
                return Integer.MIN_VALUE;
        }
    }
}

/*
calculate('+', 1, 2);  // 3
calculate('*', 1, 2);  // 2
calculate('-', 10, 2);  // 8
 */
