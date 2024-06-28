package d4.q3;

public class Person {
    // `Person`은 이름, 나이에 대한 정보를 가졌다.
    private String name;
    private int age;

    // 이름을 인자로 받는 생성자가 있으며,
    public Person(String name) {
        this.name = name;
        // 만들어 졌을 때 나이는 `0`이다.
        this.age = 0;
    }

    // `Person`은 인사를 하는 메서드를 가지고 있으며
    public void sayHello() {
        // 나이가 5살 이상이면
        if (age >= 5) {
            System.out.println(String.format(
                    "Hello, I'm %s!",
                    name
            ));
        }
        // 아니면
        else {
            System.out.println("응애응애");
        }
    }

    // `age()`라는 메서드를 가지고 있으며
    public int age() {
        // 호출되면 나이 정보가 +1 되며
        age++;
        // 새로운 나이가 반환된다.
        return age;
    }

    // 이름, 나이 정보를 반환하는 메서드를 각각 가지고 있다.
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
