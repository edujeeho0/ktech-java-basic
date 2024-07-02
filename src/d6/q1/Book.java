package d6.q1;

// Book 클래스는 제목, 페이지 수에 대한 정보를 가지고 있다.
public abstract class Book {
    private String title;
    private int pages;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // Book 클래스는 책에 대한 정보를 정리해서 보여주는 목적의
    // printInfo() 추상 메서드를 가지고 있다.
    public abstract void printInfo();
}
