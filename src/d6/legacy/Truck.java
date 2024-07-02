package d6.legacy;

// 트럭은 일종의 자동차다.
// Truck is a Car
// 트럭(Truck)이 자동차(Car)를 상속받는다.
public class Truck extends Car {
    // 트럭만 가지는 속성
    private int maxLoad;

    public Truck(String name) {
        super(name);
    }

    public int getMaxLoad() {
        return maxLoad;
    }
}
