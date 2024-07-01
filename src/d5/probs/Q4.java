package d5.probs;

/*
미세먼지 수치를 입력받고,

0 ~ 30 이면 좋음
31 ~ 80 이면 보통
81 ~ 150 이면 나쁨
151 ~ 이면 매우 나쁨

이라는 문자열을 반환하는 메서드를 작성하시오.
*/
public class Q4 {
    public static void main(String[] args) {
        int dust = 50;
        System.out.println(rateDust(dust));
        System.out.println(String.format("오늘의 먼지 상태는 %s", rateDust(dust)));
    }

    public static String rateDust(int dust) {
        if (dust <= 30) {
            return "좋음";
        }
        else if (dust <= 80) {
            return "보통";
        }
        else if (dust < 150) {
            return "나쁨";
        }
        else {
            return "매우 나쁨";
        }
    }
}
