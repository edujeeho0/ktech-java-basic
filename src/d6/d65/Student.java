package d6.d65;

public class Student extends Person {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    // 이 객체를 문자열로 표현하면 어떻게 표현될지
    public String toString() {
        return String.format(
                "%s - %s",
                super.toString(), major
        );
    }

    // Method Overriding (Override)
    @Override  // 표기의 목적이 가장 크다.
    public void sayHello() {
        System.out.println(String.format(
                "Hello my name is %s, and " +
                        "I'm studying %s.",
                getName(),
                getMajor()
        ));
    }
}
