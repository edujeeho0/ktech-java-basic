package d4.q5;

/*
`Note` 클래스를 만들어보자.
 */
public class Note {
    // 제목과 페이지를 각각 문자열과 문자열 배열로 가지고 있다.
    private String title;
    private String[] pages;

    // 생성자는 제목과 페이지 수를 인자로 받는다.
    public Note(String title, int pages) {
        this.title = title;
        this.pages = new String[pages];
    }

    // 글을 작성할 수 있는 `write` 메서드
    // 작성할 쪽과 작성할 내용
    public void write(int page, String content) {
        pages[page] = content;
    }

    // 글을 읽을 수 있는 `read` 메서드
    // 읽을 쪽을 인자로 받는다
    public String read(int page) {
        // 작성된 내용을 반환한다.
        return pages[page];
    }

    // 총 몇쪽이 작성되었는지를 반환하는 메서드를 가지고 있다.
    public int wrotePages() {
        int count = 0;
        for (String page : pages) {
            if (page != null) count++;
        }
        return count;
    }

    // 작성된 모든 내용을 페이지 순서대로 출력하는 메서드를 가지고 있다
    public void readAll() {
        for (String page : pages) {
            // 작성되지 않은 페이지는 출력하지 않는다.
            if (page != null) System.out.println(page);
        }
    }

    public String getTitle() {
        return title;
    }
}

