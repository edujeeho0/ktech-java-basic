package d1;

import java.util.Scanner;

public class D12Scanner {
    public static void main(String[] args) {
        // Scanner 사용하기
        Scanner scanner = new Scanner(System.in);
        // scanner.nextLine()
        // 사용자의 다음 Enter 입력까지 String으로 받아온다.
        String inputLine = scanner.nextLine();
        System.out.println(inputLine);

        // 사용자한테 입력을 두번 받는다.
        String inputLine1 = scanner.nextLine();
        // Enter를 기준으로
        String inputLine2 = scanner.nextLine();

        System.out.println(inputLine2);
        System.out.println(inputLine1);

        // int를 받고싶으면 nextInt();
        int inputA = scanner.nextInt();
        int inputB = scanner.nextInt();
        System.out.println(inputA);
        System.out.println(inputB);
        System.out.println(inputA + inputB);

        // long을 받고싶으면 nextLong();
        long inputLong = scanner.nextLong();
        System.out.println(inputLong);

        // nextFloat() 쓴다고 입력을 F를 추가하진 않는다
        float inputFloat = scanner.nextFloat();
        double inputDouble = scanner.nextDouble();

        // 참은 true, 거짓은 false
        boolean inputBool = scanner.nextBoolean();
        System.out.println(inputBool);
        // Enter를 기준으로 하지 않고, 구분되는 데이터를 기준으로 한다.
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(first);
        System.out.println(second);

        int inputInteger = scanner.nextInt();
        String nextLine = scanner.nextLine();
        System.out.println(inputInteger);
        System.out.println(nextLine);
    }
}
