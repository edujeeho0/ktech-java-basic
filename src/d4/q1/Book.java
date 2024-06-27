package d4.q1;


public class Book {
    public static int count;
    private String title;
    private String author;
    private String category;
    private int year;

    // 생성자
    // 객체를 만들때 실행되는
    // 객체를 생성해주는 메서드
    public Book() {}
    public Book(
            String title,
            String author
    ) {}

    public Book(
            String title,
            String author,
            int year
    ) {
        count++;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // 무분별한 수정을 막고
    // 정해진 방법으로만 데이터를 변경 가능하게 한다.
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2024) {
            System.out.println("error");
        }
        else this.year = year;
    }

    // 반환(결과)하는 데이터가 없을때
    public void printInfo() {
        System.out.println(String.format(
                "%s by %s, %d",
                title,
                author,
                year
        ));
    }
}
