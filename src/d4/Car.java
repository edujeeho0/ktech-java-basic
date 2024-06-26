package d4;

public class Car {
    // private이 붙으면 Car 클래스 외부에서 접근이 불가하다.
    // public, private 등을 접근 제어자라고 한다.
    private String name;
    private int fuel;

    // 생성자: 객체를 만들때 사용하는 메서드
    // => 새로운 객체를 만드는 방법
    public Car(String newName) {
        name = newName;
        fuel = 100;
    }

    // Getter & Setter
    public int getFuel() {
        return fuel;
    }

    public void setFuel(int moreFuel) {
        if (!(fuel > moreFuel)) {
            fuel = moreFuel;
        }
    }

    public String getName() {
        // private이어도 클래스 안에서는 사용 가능
        return name;
    }
}
