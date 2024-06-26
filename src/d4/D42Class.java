package d4;

public class D42Class {
    public static void main(String[] args) {
        CarPublic newMyCar = new CarPublic();
        newMyCar.name = "K7";
        newMyCar.brand = "Kia";
        newMyCar.printCarInfo();

        // ??????
        newMyCar.name = "E-class";
        newMyCar.brand = "Benz";
        newMyCar.printCarInfo();
        // 자동차의 이름이나 브랜드는 함부로 바뀌면 안될텐데?

        Car myCar = new Car(
                "K5"
        );
        myCar.setFuel(100);
        myCar.setFuel(-1);
        System.out.println(myCar.getFuel());
        System.out.println(myCar.getName());
    }
}
