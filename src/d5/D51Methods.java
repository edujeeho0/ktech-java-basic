package d5;

import d4.q3.Person;

import java.util.Scanner;

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
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumIntArray(numbers));

        String str = "Jeeho Park";
        int n = 5;
//        // str을 n번 반복해서 출력하세요
//        for (int i = 0; i < n; i++) {
//            System.out.println(str);
//        }
//        printNTime(str, n);
        printNTime("asdf", 10);
        printNTime("jkl", 3);

        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1999));

        voidReturn(10);
        voidReturn(5);
    }


    // 특정 문자열(str)을 n번 반복해서
    // 출력(검은 창에 보이게)하는 메서드
    public static void printNTime(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    // 매개변수의 갯수는 제한이 없으며,
    // 각 매개변수를 ',' 로 구분한다.
    public static int addThree(int a, int b, int c) {
        return a + b + c;
    }
    // 매개변수의 자료형에는 제한이 없다.
    public static int sumIntArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    // 내가만든 클래스도 사용 가능
    public static void readPerson(Person person) {
        person.sayHello();
    }

    public static int negative(int number) {
//        return number * -1;
        return -number;
    }

    // 두 수의 차이를 구하는 메서드
    public static int diff(int a, int b) {
//        int diff = a - b;
//        if (diff < 0) {
//            diff *= -1;
//        }
//        return diff;
        int diff = a - b;
        if (diff > 0) return diff;
        return -diff;
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


    // 연도(int)가 주어졌을 때 2월이 29일인지 아닌지(boolean)를 판단하는 메서드
    public static boolean isLeapYear(int year) {
        // year가 4의 배수이다.
        if (year % 4 == 0) {
            // year가 100의 배수이면서 400의 배수는 아니다.
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            // 400의 배수이다.
            return true;
        }
        // 4의 배수가 아니다.
        return false;
    }

    // 주어진 숫자가 짝수면 아무것도 안하고 돌아가는 메서드
    public static void voidReturn(int a) {
        if (a % 2 == 0) return;
        System.out.println("not even");
    }
}
