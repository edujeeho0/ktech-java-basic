package d6.d63;

public class D63Abstract {
    public static void main(String[] args) {
        // 추상클래스는 객체로 만들 수 없다.
        // Person person = new Person();

        Person person = new Student();
        person.setName("Alex");
        if (person instanceof Student student) {
            student.setMajor("CSE");
        }
        person.sayHello();

        Person person2 = new Lecturer();
        person2.setName("Brad");
        if (person2 instanceof Lecturer lecturer) {
            lecturer.setMajor("CSE");
        }
        person2.sayHello();
    }
}
