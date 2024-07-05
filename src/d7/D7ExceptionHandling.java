package d7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class D7ExceptionHandling {
    public static void main(String[] args) {
        safeFact(Long.MAX_VALUE);
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        readFileContents(filename);
        try {
            readFileContents2(filename);
        } catch (FileNotFoundException e) {
            System.out.println("아오....");
        }

        int[] arr = {1, 2, 3, 4};
        if (arr.length > 4)
            arr[4] = 10;
        // 예외의 가능성이 보인다면, 해당 부분을
        // try로 묶어준다.
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Integer c = null;
            System.out.println(divide(a, b));
        }
        catch (ArithmeticException e) {
            System.out.println("Sorry, can't do that");
            // Exception도 일종의 객체로 포장되어 나온다.
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
        // 만약 실행하는 코드가 여러 종류의 예외를 발생시킨다면,
        // 해당하는 예외만큼 catch를 추가할 수 있다.
//        catch (NullPointerException ignored) {
//            System.out.println("NPE!!!");
//        }
        // 하나의 catch로 여러 종류의 예외 처리 가능
        catch (InputMismatchException | NullPointerException ignored) {
            System.out.println("Something Bad Has Happened");
        }
        // try가 정상으로 실행되든,
        // catch가 실행되든
        // finally는 무조건 실행된다. (생략 가능)
        finally {
            System.out.println("Bye!");
        }
    }

    // Checked Exceptiom:
    // Code 외적인 상황으로 발생할 수 있는 예외
    public static void readFileContents(String filename) {
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
        // 직접 처리하거나,
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }
    }

    public static void readFileContents2(String filename)
            // 발생 가능성을 명시해야 한다.
            throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
    }

    public static void recursive(long n) {
        if (n == 0) return;
        recursive(n - 1);
    }

    public static int safeFact(long n) {
        // 만약 너무 큰 숫자를 방지하고 싶다면,
        if (n > 50) {
//            RuntimeException e = new RuntimeException("좀 작은 숫자 넣어주세요.");
//            throw e;
            // 직접 예외를 발생시킬 수 있다. 안쪽에 작성한 내용은 getMessage()로 확인 가능.
            throw new RuntimeException("too big input");
        }
        if (n == 0) return 1;
        return safeFact(n - 1);
    }

    // 메서드 하나만...
    // int a와 int b를 인자로 받아
    // a / b를 반환하는 메서드 만들어주세요
    public static int divide(int a, int b) {
        // 내부에서 오류를 방지하면
        // 외부에서 대처가 달라질 수 없다.
//        if (b != 0)
//            return a / b;
//        else
//            return Integer.MAX_VALUE;
        return a / b;
    }
}
