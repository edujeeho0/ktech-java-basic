package d6.d63;

public class Lecturer extends Person {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
