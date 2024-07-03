package d6.d64;

// interface는 하나만 상속받지는 않는다.
public class Car implements Beeper, Drivable {
    @Override
    public void beep() {
        System.out.println("빵빵");
    }

    @Override
    public void drive() {

    }
}
