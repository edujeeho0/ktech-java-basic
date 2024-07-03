package d6.d65;

public class D65Object {
    public static void main(String[] args) {
        Person alex = new Student();
        alex.setName("alex");
        alex.setAge(25);
        if (alex instanceof Student student) {
            student.setMajor("CSE");
        }
        // 임의의 객체를 println에 전달하면
        // println(Object o)가 호출된다.
        System.out.println(alex);
        // Object는 모든 Java 클래스가 상속받는 클래스
        Object something = new Lecturer();
        if (something instanceof Lecturer lecturer) {
            lecturer.setName("brad");
            lecturer.setAge(40);
            lecturer.setMajor("CSE");
        }
        System.out.println(something);

        Person alex2 = new Student();
        alex2.setName("alex");
        alex2.setAge(25);
        if (alex2 instanceof Student student) {
            student.setMajor("CSE");
        }
        System.out.println();
        System.out.println(alex);
        System.out.println(alex2);
        // 객체들의 비교는 주소값을 비교하게 된다.
        System.out.println(alex == alex2);
        System.out.println(alex.equals(alex2));
//        System.out.println("name" == "name");
//        System.out.println(alex.getName() == alex2.getName());
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("name" == scanner.nextLine());
    }
}
