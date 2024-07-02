package d6.q1;

// Magazine 클래스는 몇년몇월 호인지, 주제가 무엇인지에 대한 정보를 가지고 있다.
public class Magazine extends Book {
    private int year;
    private int month;
    private String subject;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        System.out.println(String.format(
                "title: %s", getTitle()
        ));
        System.out.println(String.format(
                "year: %d", year
        ));
        System.out.println(String.format(
                "month: %d", month
        ));
        System.out.println(String.format(
                "subject: %s", subject
        ));
        System.out.println(String.format(
                "pages: %d", getPages()
        ));
    }
}
