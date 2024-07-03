package d6.d65;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;


    // 내가 만든 클래스도 Java 내부의 기능들(println)에 대하여
    // 동작하는 방식을 정하고 싶다면 만들 수 있는 메서드들
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    // Hash Function -> 검색해볼것
    public int hashCode() {
        return Objects.hash(name, age);
    }

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
