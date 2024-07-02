package d6.q0;

/*
사람(Person) 클래스를 만든다.
1. 이름, 나이 정보를 가지고 있으며, 자유롭게 설정이 가능하다.
2. getOld() 메서드를 가지고 있으며, 호출될 시 해당 객체의 나이가 증가한다.
 */
public class Person {
    private String name;
    private int age;

    public void getOld() {
        age++;
    }

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
