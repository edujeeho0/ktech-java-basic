package d6.q0;

public class Main {
    public static void main(String[] args) {
        Person somebody = new Student();
        somebody.setName("Alex");
        somebody.setAge(25);
        System.out.println("somebody's name is: " + somebody.getName());
        if (somebody instanceof Student) {
            ((Student) somebody).setMajor("CSE");
            ((Student) somebody).setCredit(2.78);
            System.out.println("somebody is student");
            System.out.println("major is: " + ((Student) somebody).getMajor());
            ((Student) somebody).printInfo();
        }
    }
}
