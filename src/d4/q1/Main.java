package d4.q1;

import java.util.Scanner;

/*
Book 클래스를 만들어보자.

1. Book은 제목, 작가, 분류, 출판년도에 대한 정보를 가졌다.
2. 생성자와 Getter, Setter 메서드는 자유롭게 만든다.
3. `printInfo()` 메서드가 존재하며, 호출될 시 아래와 같은
    출력이 일어난다.
`<제목> by <작가>, <출판년도>`
 */
public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // 결과는 어떤 형태의 데이터가 나오나?
//        scanner.nextLong();

        Book book = new Book(
                "제목",
                "미상",
                2000
        );
        Book book2 = new Book(
                "제목",
                "미상",
                2000
        );
        Book book3 = new Book(
                "제목",
                "미상",
                2000
        );
        System.out.println(Book.count);
//        book.title = "오펜하이머";
//        book.setTitle("오펜하이머");
//        book.setYear(2023);
//        book.author = "미상";
//        book.category = "문학";
//        book.year = 2000;

//        System.out.println(book.title);
//        System.out.println(book.author);
//        System.out.println(String.format(
//                "%s by %s, %d",
//                book.title,
//                book.author,
//                book.year
//        ));
//        book.title = "아인슈타인";
        book.printInfo();
    }

}
