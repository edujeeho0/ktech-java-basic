package d4;

// 자동차 설계도
// class
public class CarPublic {
    // 정적: 움직이지 않는다.
    // class에서 움직이지 않는다. => class의 속성
    public static int count = 0;

    // attribute, field, property....
    // member variable
    // 이름
    public String name;
    // 브랜드
    public String brand;
    // 연료 상태
    public int fuel;

    public static int countCars() {
        // 정적 메서드는 객체의 속성을 쓸 수 없다.
        // 클래스는 객체가 아니니까...
        // System.out.println(name);
        return count;
    }

    // 정보를 출력하는 메서드
    public void printCarInfo() {
        System.out.println(String.format(
                "name: %s, brand: %s",
                // 자동차의 속성을 사용할 수 있다.
                name, brand
        ));
    }

    // 연료를 추가하는 메서드
    public void addFuel(int moreFuel) {
        // 자동차의 속성을 수정할 수 있다.
        fuel += moreFuel;
    }

    // 연료를 소모하는 메서드
    // drive
    public int drive(int kilos) {
        // 자동차의 속성을 수정할 수 있다.
        fuel -= kilos / 10;
        // 내 속성을 반환할 수도 있다.
        return kilos / 10;
    }

    // addTwo: 이름
    // int: 이 메서드를 실행했을 때
    //      어떤 자료형의 결과가 돌아오는지
    // (int a): 매개변수, 메서드를 사용할때
    //         정의할 x
    // return: 이 메서드의 결과로 반환될 값
    public int addTwo(int a) {
        System.out.println(a);
        a += 10;
        a *= 10;
        return a + 2;
    }
}
