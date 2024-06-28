package d4.q3;

/*
`Person` 클래스를 만들어보자.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jeeho Park");
        person.sayHello();
        for (int i = 0; i < 50; i++) {
//            person.age();
            System.out.println(String.format(
                    "You are now, %d years old",
                    person.age()
            ));
        }
        person.sayHello();
        System.out.println(person.getAge());
        System.out.println(person.getName());

    }
}
