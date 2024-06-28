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
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

}
