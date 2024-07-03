package d6.d65;

public class Lecturer extends Person {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return String.format(
                "%s - %s, Lecturer",
                super.toString(), major
        );
    }

    @Override
    // sayHello가 없으면 Person이 될 수 없다.
    public void sayHello() {
        System.out.println(String.format(
                "Hello, I'm %s, and I teach %s.",
                getName(),
                major
        ));
    }
}
