package tmp;

// 자동차는 name, brand, fuel에 대한 정보를 가지고 있다.
// 이름과 브랜드는 만들어진 뒤 쉽게 변경될 수 없다.
// 1. 이름과 브랜드와 연료정보는 전부 Getter를 가지고 있다.
// 2. 이름과 브랜드의 Setter는 없어야 한다.
// 3. 모든 속성을 받는 생성자를 만들자.
// 자신의 정보를 출력하는 기능을 가지고 있다.
public class Car {
    // 속성들
    private String name;
    private String brand;
    private int fuel;

    // 생성자
    public Car(
            String name,
            String brand,
            int fuel
    ) {
        this.name = name;
        this.brand = brand;
        this.fuel = fuel;
    }

    // Getter
    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuel() {
        return fuel;
    }

    // Setter
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void printInfo() {
        System.out.println(String.format(
                "name: %s, brand: %s, fuel: %d",
                name, brand, fuel
        ));
    }
}
