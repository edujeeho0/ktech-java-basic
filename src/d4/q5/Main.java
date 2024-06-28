package d4.q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Note cseNote = new Note("CSE", 8);
        cseNote.write(0, "Java");
        cseNote.write(1, "Is Too Hard");
        cseNote.write(2, "No it isn't");

        System.out.println(cseNote.read(1));

        cseNote.readAll();

        cseNote.write(7, "this is the last page");
        cseNote.readAll();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Title: ");
        String title = scanner.nextLine();
        System.out.print("Input Pages: ");
        int pages = scanner.nextInt();
        Note note = new Note(title, pages);
        while (true) {
            System.out.print("어떤 행동을 하실건가요? :");
            // 사용자가 어떤 행동을 할지를 선택하게 한 뒤
            int userSelect = scanner.nextInt();
            // 조건문으로 Note의 기능을 선택하게 만든다.
            if (userSelect == 1) {
                int page = scanner.nextInt();
                scanner.nextLine();
                String content = scanner.nextLine();
                note.write(page, content);
            }
            else if (userSelect == 2) {
                int page = scanner.nextInt();
                scanner.nextLine();
                System.out.println(note.read(page));
            }
            else if (userSelect == 3)
                note.readAll();
            else if (userSelect == 4)
                break;
        }
    }
}
