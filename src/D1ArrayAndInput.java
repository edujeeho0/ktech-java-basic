import java.util.Scanner;

public class D1ArrayAndInput {
    public static void main(String[] args) {
        // 사용자에게 숫자 하나를 입력받고
        // 그 만큼의 이름을 입력받는 프로그램
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] names = new String[n];
        names[0] = scanner.nextLine();
        names[1] = scanner.nextLine();
        names[2] = scanner.nextLine();
    }
}
