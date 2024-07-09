package d10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class D10FileIO {
    public static void main(String[] args) {
//        fileReader();
        List<Person> people = bufferedReader();
        people = people.stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .toList();
        bufferedWriter(people);
    }

    public static void bufferedWriter(List<Person> people) {
        // BufferedWriter: 버퍼링을 통해 출력을 효율적으로
        //      그냥 사용할 경우 파일을 완전히 덮어쓴다.
        //      그래서 최종적인 파일의 상태를 출력하는게 편하다.
        // 만약, 이전 데이터에 이어서 데이터를 작성하고 싶다면,
        // FileWriter의 생성자에 true 추가
        try (FileWriter fileWriter = new FileWriter("people.csv");
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            for (Person person : people) {
                /*writer.write(person.toString());
                writer.newLine();*/
                StringBuilder lineBuilder = new StringBuilder();
                lineBuilder.append(person.getName()).append(',');
                lineBuilder.append(person.getEmail()).append(',');
                lineBuilder.append(person.getAge()).append(',');
                lineBuilder.append(person.getGender());
                String line = lineBuilder.toString();
                writer.write(line);
                // BufferedWriter의 newLine()은 OS별 개행문자의 차이를 없에준다.
                writer.newLine();
            }

            /*// write: 주어진 인자를 출력한다.
            writer.write("Hello FileIO!!!!!!!!");
            // newLine: 개행문자를 출력한다.
            writer.newLine();*/
        } catch (IOException e) {
            // 파일 열기 실패...
            System.out.println("데이터 작성을 위한 파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
    }

    public static List<Person> bufferedReader() {
        List<Person> people = new ArrayList<>();
        try (FileReader fileReader = new FileReader("people.csv");
             BufferedReader reader = new BufferedReader(fileReader)) {
            String line;
            // BufferedReader는 데이터를 버퍼링 해준다.
            //      많은 데이터를 한번에 모아서 전달한다.
            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(",");
                people.add(new Person(
                        elements[0],
                        elements[1],
                        Integer.parseInt(elements[2]),
                        elements[3]
                ));
            }
        } catch (IOException e) {
            // 파일 열기 실패...
            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
//        System.out.println(people);
        return people;
    }

    public static void fileReader() {
        // Java 7 이후
        // try-with-resource
        // 사람을 보관할 리스트
        List<Person> people = new ArrayList<>();
        try (FileReader reader = new FileReader("people.csv")) {
            // 읽어들인 문자를 저장하기 위한 변수
            int character;
            // 데이터를 모아서 문자열로 만들어줄 StringBuilder
            StringBuilder lineBuilder = new StringBuilder();
            // character에 읽은 결과를 넣어주고, 해당 값이 -1이 아닐 동안
            while ((character = reader.read()) != -1) {
                // 이번에 읽은 문자가 다음줄 ('\n', '\r')
                if (character == '\n' || character == '\r') {
                    // 한줄 끝, 문자열로 변환
                    String line = lineBuilder.toString();
                    if (line.isEmpty()) continue;
                    // 문자열을 ',' 단위로 나눈다.
                    String[] elements = line.split(",");
                    // 사람 객체로 변환해서 추가한다.
                    people.add(new Person(
                            elements[0],
                            elements[1],
                            Integer.parseInt(elements[2]),
                            elements[3]
                    ));

                    // StringBuilder 초기화
                    lineBuilder.setLength(0);
                }
                // 아니면 줄에 포함시킨다.
                else {
                    lineBuilder.append((char) character);
                }
            }
            // try - catch가 끝날 때 reader.close()가 자동으로 동작한다.
        } catch (IOException e) {
            // 파일 열기 실패...
            System.out.println("파일을 열지 못했습니다...");
            System.out.println(e.getMessage());
        }
        // 결과 출력
//        System.out.println(people);
        people.stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
                .forEach(System.out::println);
    }

    public static void stringBuilderExample() {
        // StringBuilder는 append로 추가된 데이터를 문자열로 만들어준다.
        StringBuilder builder = new StringBuilder();
        builder.append("alex");
        builder.append(" ").append(25);
        System.out.println(builder);
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
