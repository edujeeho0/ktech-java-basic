package d3.prob;

import java.util.Scanner;

/*
축구리그에서 승점을,
- 승리시 3점
- 무승부시 1점
- 패배시 0점
획득하기로 했다.

남은 경기(N)과 현재 승점(S)과 목표 승점(G)이 주어졌을 때,
남은 경기에서 목표 승점을 넘을 수 있으면 필요한 최소 승수를 없으면 최고 승점을 출력하여라.
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = scanner.nextInt();
        int score = scanner.nextInt();
        int goal = scanner.nextInt();
        // 일단 최고점을 구하자.
        int maxScore = score + games * 3;
        // 일단 쉬운것부터
        if (maxScore < goal) {
            System.out.println(maxScore);
        }
        // 다음은 최소승수를 계산해야 한다.
        else {
            // 승리가 무승부로 바뀌면 최고점이 2점 감소
            // 최고점이 얼만큼 더 넘치게 점수를 얻었는지 계산
            int overScore = maxScore - goal;
            // 무승부가 증가하면 2점이 줄어드니
            // 가장 많이 무승부를 해보자
            int draws = overScore / 2;
            // 그리고 남은 경기에서 빼면 승수가 된다.
            int minWins = games - draws;
            System.out.println(minWins);
        }
    }
}
