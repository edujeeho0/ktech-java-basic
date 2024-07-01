package d6;

// Car has a Brand
public class Car {
    private String name;
    private Brand brand;
    private int fuel;

    public Car(String name) {
        this.name = name;
        this.fuel = 100;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void drive(int kilos) {
        this.fuel -= kilos / 10;
    }
}
