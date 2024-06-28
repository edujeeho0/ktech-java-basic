package d5;

public class D52Recursive {
    public static void main(String[] args) {
        System.out.println(factLoop(5));
        System.out.println(factLoop(6));
        System.out.println(factLoop(10));
        System.out.println(factRecur(5));
        System.out.println(factRecur(6));
        System.out.println(factRecur(10));
        System.out.println(fibo(12));
    }

    // 방법1: 반복문을 사용한다.
    public static int factLoop(int n) {
        int result = 1;
        // i는 1 ~ n 까지 반복해서 커진다.
        for (int i = 1; i < n + 1; i++) {
            result *= i;
        }
        return result;
    }

    // 방법2: f(n) = n * f(n - 1)을 코드로 옮긴다.
    // f(1) == 1, f(0) == 1, 0! = 1
    public static int factRecur(int n) {
//        if (n < 2) {
//            return 1;
//        }
//        else {
//            // factRecur 내부에서 factRecur를 호출한다.
//            // 재귀적 호출 -> 재귀 함수
//            int result = n * factRecur(n - 1);
//            return result;
//        }
        if (n < 2) return 1;
        return n * factRecur(n - 1);
    }

    public static int fibo(int n) {
        if (n == 0) return 0;
        if (n < 3) return 1;
        return fibo(n - 2) + fibo(n - 1);
    }
}
