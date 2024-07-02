package d6.d62;

public class Car {
    // protected: 자식 클래스는 건드릴 수 있다.
    protected int fuel;

    public void beep() {
        System.out.println("BEEEP");
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
