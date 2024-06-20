package d1.probs;

import java.util.Scanner;

// 사용자에게 3개의 이름을 입력받고,
// 이후 3개의 실수를 입력받은 뒤,
// 예시 출력처럼 출력하는 코드를 작성하시오.
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 0. 각 데이터를 저장할 배열을 미리 만든다.
        String[] names = new String[3];
        double[] scores = new double[3];

        // 1. 이름을 세번 입력받아,
        // 각각 names[]에 저장한다.
        names[0] = scanner.nextLine();
        names[1] = scanner.nextLine();
        names[2] = scanner.nextLine();

        // 2. 점수를  세번 입력받아,
        // 각각 scores[]에 저장한다.
        scores[0] = scanner.nextDouble();
        scores[1] = scanner.nextDouble();
        scores[2] = scanner.nextDouble();

        // 3. 각각 출력한다.
        String template = "name - %s, grade - %.1f";
        System.out.println(String.format(template, names[0], scores[0]));
        System.out.println(String.format(template, names[1], scores[1]));
        System.out.println(String.format(template, names[2], scores[2]));
    }
}
/*
입력:
alex
brad
chad
3.0
4.0
4.5
 */

/*
출력:
name - alex, grade - 3.0
name - brad, grade - 4.0
name - chad, grade - 4.5
 */