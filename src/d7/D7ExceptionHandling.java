package d7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class D7ExceptionHandling {
    public static void main(String[] args) {
        // 예외의 가능성이 보인다면, 해당 부분을
        // try로 묶어준다.
        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            Integer c = null;

            System.out.println(divide(a, b));
            // divide(int a, int b)에 null이 전달되었다...
            System.out.println(divide(a, c));
        }
//        catch (InputMismatchException e) {
//            System.out.println("please input integer");
//        }
        // catch - try에서 발생한 예외를 잡아라.
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
