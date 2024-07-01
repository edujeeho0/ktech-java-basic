package d6;

public class Main {
    public static void main(String[] args) {
        Truck porter = new Truck("porter");
        System.out.println(porter.getFuel());
        porter.drive(10);
        System.out.println(porter.getFuel());
        Car sonata = new Car("sonata");
        System.out.println(sonata.getFuel());
        sonata.drive(50);
        System.out.println(sonata.getFuel());
    }
}
