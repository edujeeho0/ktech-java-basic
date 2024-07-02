package d6.d63;

// abstract class: 추상 클래스 -> 만들다 만 클래스
// 구현되지 않은 메서드를 가질 수 있는 클래스
public abstract class Person {
    private String name;
    private int age;

    // 추상 메서드는 자식 클래스가 구현해야 한다고 약속
    public abstract void sayHello();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
