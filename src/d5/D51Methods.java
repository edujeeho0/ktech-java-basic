package d5;

public class D51Methods {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
//        int sum = addTwo(a, b);
//        System.out.println(sum);
        int c = 20;
        
        int result = diff(addTwo(b, c), subTwo(a, b));
        // result = diff(35, subTwo(a, b));
        // result = diff(35, -5);
        // result = 40;
        System.out.println(result);

        System.out.println(String.format("Sum: %d", result));
        // System.out.println("Sum: 40");
    }
    // 두 수의 차이를 구하는 메서드
    public static int diff(int a, int b) {
        int diff = a - b;
        if (diff < 0) diff *= -1;
        return diff;
    }

    public static int subTwo(int a, int b) {
        return a - b;
    }

    public static int addTwo(int a, int b) {
        // 중괄호 내부에서 여러 Java 코드를 통해
        // 목적을 달성한다.
//        int c = a;
//        int temp = b;
//        b = c;
//        int sum = a + b;
        return a + b;
    }
}
