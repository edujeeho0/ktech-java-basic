package d6.d64;

// Comparable interface
// 객체들을 비교하는 기준을 정의하는 interface
public class Person implements Comparable {
    private String name;
    private int age;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Person other = (Person) o;
        int nameOrder = name.compareTo(other.name);
        if (nameOrder == 0) {
            return age - other.age;
        }
        return nameOrder;
//        return age - ((Person) o).age;
    }

    public void printInfo() {
        System.out.println(String.format(
                "%s, %d",
                name,
                age
        ));
    }
}
