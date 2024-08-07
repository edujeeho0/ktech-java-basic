package d6.q0;

import d6.d62.Car;

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
        somebody = new Lecturer();
        somebody.setName("Brad");
        somebody.setAge(45);
        System.out.println("somebody's name is: " + somebody.getName());
        if (somebody instanceof Lecturer) {
            Lecturer lecturer = (Lecturer) somebody;
            lecturer.setMajor("CSE");
            lecturer.setPapers(0);
            System.out.println("somebody is lecturer");
            System.out.println("major is: " + lecturer.getMajor());
            lecturer.printInfo();
        }
    }
}
