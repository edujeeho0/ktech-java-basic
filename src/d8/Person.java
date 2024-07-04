package d8;

public class Person
        implements Comparable<Person>
{
    private String name;
    private int age;

    @Override
    public int compareTo(Person other) {
        return age - other.age;
    }
}
