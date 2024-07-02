package d6.q1;

public class Main {
    public static void main(String[] args) {
        Book book = new Magazine();
        book.setTitle("Today's Baseball");
        book.setPages(100);
        if (book instanceof Magazine magazine) {
            magazine.setYear(2024);
            magazine.setMonth(7);
            magazine.setSubject("Baseball");
        }
        book.printInfo();

        Book sherlok = new Series();
        sherlok.setTitle("Holmes");
        sherlok.setPages(400);
        if (sherlok instanceof Series series) {
            series.setAuthor("Conan Doyle");
            series.setSubtitle("Return of Sherlok Holmes");
            series.setVolume(20);
        }
        sherlok.printInfo();
    }

    public static void printBookInfo(Book book) {
        book.printInfo();
    }

    public static void printMagazineInfo(Magazine magazine) {
        magazine.printInfo();
    }

    public static void printSeriesInfo(Series series) {
        series.printInfo();
    }
}
