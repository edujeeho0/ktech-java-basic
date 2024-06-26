package d4;

import java.util.Scanner;

public class D41Class {
    public static void main(String[] args) {
        // 새로운 Scanner를 만들어보자.
        Scanner scanner = new Scanner(System.in);

        // 새로운 자동차를 만들어보자.
        CarPublic myCar = new CarPublic();
        CarPublic.count++;
        // 이건 소나타다!
        myCar.name = "Sonata";
        // 소나타는 현대차다.
        myCar.brand = "Hyundai";
        // 얼마전에 주유했다.
        myCar.fuel = 100;

        // 내 친구의 자동차도 만들어주자.
        CarPublic friendCar = new CarPublic();
        CarPublic.count++;
        // K5다!
        friendCar.name = "K5";
        friendCar.brand = "Kia";

        // 내 차의 이름을 출력해보자.
        System.out.println(myCar.name);
        // 친구차의 이름을 출력해보자.
        System.out.println(friendCar.name);

        // 자동차한테 자신의 정보를 알려달라 하자.
        myCar.printCarInfo();
        friendCar.printCarInfo();

        int result = myCar.addTwo(10);
        System.out.println(result);

        myCar.addFuel(50);
        System.out.println(myCar.drive(100));
        System.out.println(myCar.fuel);

        CarPublic randomCar = new CarPublic();
        CarPublic.count++;
        // 여기의 출력은?
        System.out.println(CarPublic.count);
        // 객체의 속성
        randomCar.name = "K3";
        // class는 객체가 아니라 단순한 설계도라
        // name을 볼 수 없다.
        // Car.name;
        System.out.println(CarPublic.countCars());
        // 문자열 만들기
        String myStr = "";
        // 문자열 만들건데...
        String formatStr = String.format("%d", 1);
    }
}
