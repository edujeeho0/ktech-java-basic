package d6.d62;


// Truck is a Car
// Truck은 Car의 기능을 다 가지고 있다.
// extends: 현 클래스는 뒤에 있는 클래스를 상속받는다.
public class Truck extends Car {
    private int maxLoad = 100;
    private int load;

    // 짐을 싣는 메서드
    public boolean addLoad(int load) {
        // 내가 짐을 추가할 수 없으면 false
        if (this.load + load > maxLoad) return false;
        // 추가하고
        this.load += load;
        // true
        return true;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public int getLoad() {
        return load;
    }

    public void drive(int kilos) {
        super.drive(kilos);
        // protected는 자식도 사용 가능
        fuel -= load / (maxLoad / 10);
//        // 추가 소비 연료량
//        int extra = load / (maxLoad / 10);
//        // 추가소비가 끝난 뒤의 연료량
//        int nextFuel = getFuel() - extra;
//        // 그걸 저장하기
//        setFuel(nextFuel);
    }
}
