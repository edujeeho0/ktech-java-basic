package d4;

public class D4Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumArray(numbers));
        int[] numbers2 = {3, 4, 5, 6, 7};
        System.out.println(sumArray(numbers2) / numbers2.length);
        int[] numbers3 = {22, 33, 44};
        System.out.println((double) sumArray(numbers3) / numbers3.length);

        /*// 합을 저장할 변수
        int sum = 0;
        // 배열의 각 값을 확인하며 sum에 더해주자.
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

        int[] numbers2 = {3, 4, 5, 6, 7};
        sum = 0;
        // 배열의 각 값을 확인하며 sum에 더해주자.
        for (int i = 0; i < numbers2.length; i++) {
            sum += numbers2[i];
        }
        System.out.println(sum);

        int[] numbers3 = {113, 124, 555, 23};
        sum = 0;
        // 배열의 각 값을 확인하며 sum에 더해주자.
        for (int i = 0; i < numbers3.length; i++) {
            sum += numbers3[i];
        }
        System.out.println(sum);*/
    }

    // 메서드를 만드는 목적은 같은 코드를 반복하지 않기 위해
    // 정수 배열의 모든 값의 합을 구하는 메서드를 만들어 보자.
    public static int sumArray(int[] numbers) {
        // 합을 저장할 변수
        int sum = 0;
        // 배열의 각 값을 확인하며 sum에 더해주자.
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
//        System.out.println(sum);
        return sum;
    }
}
