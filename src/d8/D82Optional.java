package d8;

import java.util.Optional;
import java.util.Random;

public class D82Optional {
    public static void main(String[] args) {
        // Random 예시
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt() % 2);
//        }
        String target = "not null string";
//        for (int i = 0; i < 10; i++) {
//            // 요 코드는 NPE 발생 가능성 높음
//            if (nullOrString().equals(target))
//                System.out.println("equals");
//            else System.out.println("not equals");
//        }

        for (int i = 0; i < 10; i++) {
            System.out.println("try: " + i);
            // 문자열 일수도, null 일수도 있는 값
            // 을 들고있는 클래스
            Optional<String> optionalString
                    = Optional.ofNullable(nullOrString());
            // 만약 nullOrString()의 결과가 null이 아니라면, isPresent가 true
            if (optionalString.isPresent())
                System.out.println(optionalString.get());
            // 아니라면(결과가 null이라면), isEmpty가 true
            if (optionalString.isEmpty())
                System.out.println("result was null");
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("try: " + i);
            Optional<String> optionalString
                    = Optional.ofNullable(nullOrString());
            // .orElse: 만약 isEmpty라면(결과가 null이면) 대신 사용할 데이터
            String resultString
                    = optionalString.orElse("got: null");
            System.out.println(resultString);
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("try: " + i);
            String result = nullOrOptional()
                    .orElse("got: null");
            System.out.println(result);
            System.out.println();
        }
    }

    // 50%의 확률로 null을 반환하는 메서드
    public static String nullOrString() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            System.out.println("return not null");
            return "not null string";
        }
        System.out.println("return null");
        return null;
    }

    // 50%의 확률로 empty한 Optional을 반환하는 메서드
    public static Optional<String> nullOrOptional() {
        Random random = new Random();
        if (random.nextInt() % 2 == 0) {
            System.out.println("return not null");
            return Optional.of("not null string");
        }
        System.out.println("return null");
        return Optional.empty();
    }
}
