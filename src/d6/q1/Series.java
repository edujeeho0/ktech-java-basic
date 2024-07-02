package d6.q1;

// Series 클래스는 작가, 부제, 시리즈의 몇번째 권인지에 대한 정보를 가지고 있다.
public class Series extends Book {
    private String author;
    private String subtitle;
    private int volume;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void printInfo() {
        System.out.println(String.format(
                "title: %s", getTitle()
        ));
        System.out.println(String.format(
                "author: %s", author
        ));
        System.out.println(String.format(
                "subtitle: %s", subtitle
        ));
        System.out.println(String.format(
                "volume: %d", volume
        ));
        System.out.println(String.format(
                "pages: %d", getPages()
        ));
    }
}
