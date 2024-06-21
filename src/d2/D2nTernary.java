package d2;

public class D2nTernary {
    public static void main(String[] args) {
        // 삼항 연산자
        int temperature = 37;
        // ? 앞의 조건이 참이면, : 의 왼쪽
        // ? 앞의 조건이 거짓이면, : 의 오른쪽
        // 으로 결과가 나오는 연산자
        String message = (temperature < 38) ? "OK" : "fever";
        System.out.println(message);

        int result = (temperature < 38) ? 10 : 20;
    }
}
