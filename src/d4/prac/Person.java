package d4.prac;

/*
이름, 나이
이름은 마음대로 정할 수 있다.
기본적으로 나이는 25살이다. 마음대로 변화시키지 못한다.
 */
public class Person {
    // name은 이름을 담기 위한 속성
    private String name;
    // age는 나이를 담기 위한 속성
    private int age;

    public Person() {
        age = 25;
    }
    // 이름을 넣어주는 메서드
    public void setName(String newName) {
        name = newName;
    }

    // 이름을 알려주는 메서드
    public String getName() {
        return name;
    }

    // 나이를 알려주는 메서드
    public int getAge() {
        return age;
    }
}
