package d6.d62;

public class Student extends Person {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Method Overriding (Override)
    @Override  // 표기의 목적이 가장 크다.
    public void sayHello() {
        // 상위 클래스(부모 클래스)
        // super를 이용하면 부모 클래스의 메서드를 사용할 수 있다.
        super.sayHello();
        System.out.println(String.format(
                "I'm studying %s.",
                major
        ));
    }
}
