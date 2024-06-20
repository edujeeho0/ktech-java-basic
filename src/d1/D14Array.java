package d1;

public class D14Array {
    public static void main(String[] args) {
        // alex의 점수
        int score1 = 85;
        // brad의 점수
        int score2 = 80;
        // chad의 점수
        int score3 = 90;

        // 여러 데이터를 하나의 변수에 담고 싶다면 배열을 만든다.
        // scores라는 int 배열을 만들고
        int[] scores = { 85, 80, 90 };
        // 85, 80, 90을 순서데로 할당한다.

        // 자료형과 상관없이 '[]'로 만든다.
        double[] grades = { 3.0, 3.5, 4.0 };
        String[] names = {"alex", "brad", "chad"};

        // 데이터를 가지고 올때는 '[]'를 쓴다.
        // 이때, 제일 앞의 데이터는 0이다.
        System.out.println(names[0]);
        System.out.println(scores[0]);
        System.out.println(grades[0]);

        // 데이터를 할당할때도 '[]'를 쓴다.
        grades[0] = 4.0;
        System.out.println(grades[0]);

        // Index Out Of Bounds 오류
        /*
        scores[3] = 10;
        System.out.println(scores[3]);
         */

        // 배열의 크기만 먼저 정할수는 있다.
        // 16칸짜리 배열 만들기 (0 ~ 15)
        int[] arr = new int[16];
        // 변수의 값만큼의 크기의 배열도 만들 수 있다.
        int studentCount = 128;
        int[] ages = new int[studentCount];

        // 배열의 크기를 알고싶다면 .length
        System.out.println(ages.length);
    }
}
