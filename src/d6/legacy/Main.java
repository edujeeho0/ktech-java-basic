package d6.legacy;

public class Main {

    public static void main(String[] args) {
        Truck porter = new Truck("porter");
        System.out.println(porter.getFuel());
        System.out.println(porter.getName());
        porter.drive(10);
        System.out.println(porter.getFuel());
        Car sonata = new Car("sonata");
        System.out.println(sonata.getFuel());
        System.out.println(sonata.getName());
        sonata.drive(50);
        System.out.println(sonata.getFuel());

        porter.beep();
        sonata.beep();
        // Upcasting
        // 자식 클래스는 별다른 조작 없이
        // 부모 클래스(자료형)에 할당 가능
        Car optimus = new Truck("Optimus Prime");
        System.out.println(String.format(
                "My name is %s",
                optimus.getName()
        ));
        refuel(sonata);
        refuel(porter);
        refuel(optimus);
        System.out.println(porter.getFuel());

        System.out.println(porter.getMaxLoad());
        // System.out.println(sonata.getMaxLoad());
        // System.out.println(optimus.getMaxLoad());
        // 자동차를 트럭으로 바꿔보기
        ((Truck) optimus).getMaxLoad();
        // ((Truck) sonata).getMaxLoad();
        // 만약 자동차 optimus가 Truck이라면,
        if (optimus instanceof Truck) {
            // Truck으로 Casting하고 Truck처럼 사용하자.
            ((Truck) optimus).getMaxLoad();
        }


        Dog dog = new Dog();
        dog.makeSound();
        dog.bark();

        Animal animal = new Animal();
        animal.makeSound();
        // animal.bark();

        Animal doggy = dog;
        doggy.makeSound();
        // doggy.bark();
        ((Dog) doggy).bark();
    }




    public static void refuel(Car car) {
        car.setFuel(100);
    }
}
