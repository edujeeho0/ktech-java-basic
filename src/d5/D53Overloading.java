package d5;

import d4.q3.Person;

public class D53Overloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a, b);

        long c = 15L;
        long d = 25L;
        long longSum = add(c, d);

        System.out.println();
        System.out.println(1);
        System.out.println("asdf");
        System.out.println(2.38274);
        System.out.println(new Person("jeeho"));

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(arraySum(numbers, 1, 5));
        System.out.println(arraySum(numbers, 1));
    }

    // 메서드 오버로딩으로 기본값 만들기
    // 정수 배열을 받고, 시작 위치, 끝 위치 사이의 정수를 합하는 메서드
    public static int arraySum(int[] arr, int s, int e) {
        int sum = 0;
        for (int i = s; i < e; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int arraySum(int[] arr, int s) {
        return arraySum(arr, s, arr.length);
    }

    public static int add(int a, int b) {
        return a + b;
    }
    // 메서드 시그니처(method signature)가 달라야 한다.
    /*public static long add(int a, int b) {
        return a + b;
    }*/

    public static long add(int a, long b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

}
