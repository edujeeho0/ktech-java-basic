package d9.probs;

/*
Java의 String은 각 문자를 int로 취급한 Stream을 반환하는 chars() 메서드가 있다.

이 메서드를 활용하여, 인자로 전달된 문자열의 각 글자마다

글자가 숫자(0 ~ 9)면 해당 숫자,
글자가 문자(A ~ Z, a ~ z)면 1
그 외에는 -1

이라고 생각하고, 모든 문자의 값을 곱한 결과를 반환하는 메서드를,
Stream API를 활용해 작성하시오.
 */
public class Qc {
    public static void main(String[] args) {
        System.out.println(computeValue("jeeho@1234"));
        System.out.println(computeValue("alex@gmail.com"));
        System.out.println(computeValue("1284--"));
        System.out.println(computeValue("park jeeho"));
    }

    public static int computeValue(String line) {
        return line.chars()
                .map(i -> {
                    if (Character.isDigit((char) i)) return i - '0';
                    if (Character.isLetter((char) i)) return 1;
                    return -1;
                })
                // 1부터 시작한 다음,
                // 이전 값들의 계산 결과를 total에,
                // 이번 데이터를 now에 인자로 전달한 다음
                // total * now를 반환하여 다음 total로 사용
                .reduce(1, (total, now) ->
                        total * now);
    }
}
