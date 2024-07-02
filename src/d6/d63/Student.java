package d6.d63;

public class Student extends CollegeMember {

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
