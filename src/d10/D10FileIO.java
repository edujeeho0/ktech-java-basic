package d10;

import java.io.FileReader;
import java.io.IOException;

public class D10FileIO {
    public static void main(String[] args) {
        fileReader();
    }

    public static void fileReader() {
        // Java 7 이후
        // try-with-resource
        try (FileReader reader = new FileReader("people.csv")) {
            // 읽어들인 문자를 저장하기 위한 변수
            int character;
            // character에 읽은 결과를 넣어주고, 해당 값이 -1이 아닐 동안
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            // try - catch가 끝날 때 reader.close()가 자동으로 동작한다.
        } catch (IOException e) {
            // 파일 열기 실패...
            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
    }

    // FileReader를 사용하는 방식
    public static void fileReader7() {
        // Java 7 이전...
        FileReader reader = null;
        try {
            reader = new FileReader("people.csv");
            // reader를 이용해서 파일의 내용을 읽으면 되는데...
        } catch (IOException e) {
            // 파일 열기 실패...
            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                // 내 열어둔 그 파일을 이제 안쓴다.
                // 다른 프로그램이 사용해도 된다.
                try {
                    reader.close();
                } catch (IOException e) {
                    // ...여기까지 오면 개발자가 할 수 있는게 별로 없다...
                }
            }
        }
    }
}
