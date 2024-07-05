package tmp;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(
                "sonata",
                "hyundai",
                123
        );
        myCar.setFuel(1234);
        myCar.printInfo();
    }
}
