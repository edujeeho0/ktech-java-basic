package d5.probs;

/*
카이사르 암호는 알파벳을 특정 글자수만큼 밀어서 새로운 알파벳으로 다시 작성하는 암호이다.

즉 A = 0 부터 Z = 25 까지 짝지어두고, 키를 10 으로 정해두면,

ABCDE -> 0 1 2 3 4 -> 10 11 12 13 14 -> KLMNO


으로 변환하는 암호이다. 이때 숫자가 25를 넘어가면, 다시 한바뀌 돌아 0에서 시작한다.

정수(키)와 문자열(암호)를 인자로 받아 카이사르 암호를 해독하는 메서드를 작성하여라.

 */
public class Qc {
    public static void main(String[] args) {
        System.out.println(caesarCode(10, "ROVVY"));
        System.out.println(caesarCode(5, "BTWQI"));
        System.out.println(caesarCode(10, "KLMNO"));
    }

    public static String caesarCode(int key, String code) {
        char[] decoded = new char[code.length()];
        for (int i = 0; i < code.length(); i++) {
            // code의 i번째 글자를 가져온다.
            char letter = code.charAt(i);
            letter -= key;
            if (letter < 'A') letter += 26;
            decoded[i] = letter;
        }
        // 새 String 만들기
//        return new String(decoded);
        return String.copyValueOf(decoded);

        // String 덧샘
        /*String text = "";
        for (char letter: decoded) {
            text = text + letter;
        }
        return text;*/

        // StringBuilder
        /*StringBuilder text = new StringBuilder();
        for (char letter: decoded) {
            text.append(letter);
        }
        return text.toString();*/

    }
}
/*
// 10, ROVVY
String result = "HELLO";

// 5, BTWQI
String result = "WORLD";
 */