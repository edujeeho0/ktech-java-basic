package d1.probs;

import java.util.Scanner;

// 사용자에게 두개의 단어를 입력받고,
// 두 단어를 붙여서 출력하는 코드를 작성하시오.
public class Qa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        // System.out.print()
        System.out.print(first);
        System.out.println(second);

        // String.format()
        System.out.println(String.format("%s%s", first, second));

        // String Concatenation
        System.out.println(first + second);
    }
}
/*
Hello
Java
 */

/*
HelloJava
 */
