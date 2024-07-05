package d5;

// Variable Length Arguments
// 변하는 길이의 인자들
public class D54Varargs {
    // 매개변수에 ...을 붙이면
    // 메서드 내부에서는 배열처럼 사용하고,
    public static int varNumSum(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    // 메서드 오버로딩시 배열을 가지고 오버로딩은 불가
    // public static int varNumSum(int[] numbers) {}

    public static void main(String[] args) {
        System.out.println(String.format(
                "%d", 10
        ));
        System.out.println(String.format(
                "%d %s", 12, "asdf"
        ));
        System.out.println(String.format(
                "%d %d %d %d %d %d %d",
                0, 1, 2, 3, 4, 5, 6
        ));
        // 메서드 밖에서는 별도의 인자로 전달이 가능하다.
        System.out.println(varNumSum(
                1,
                2,
                3,
                4,
                5,
                6,
                7,
                8));
        // 배열을 전달하는것도 가능하다.
        int[] numbers = {1, 2, 3};
        System.out.println(varNumSum(numbers));
    }
}
