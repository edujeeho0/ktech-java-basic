package d6;

public class D61Extends {
    public static void main(String[] args) {
        Truck truck = new Truck();
//        truck.setFuel(100);
        System.out.println(truck.getFuel());
        truck.beep();
        // 자동차가 필요한 곳에 트럭을 넣어줄 수 있디.
        refuel(truck);
        truck.drive(100);
        System.out.println(truck.getFuel());
        // 자동차로 취급도 가능
        Car porter = new Truck();
        porter.beep();

        // Truck의 기능 addLoad
        System.out.println(truck.getLoad());
        truck.addLoad(100);
        System.out.println(truck.getLoad());
        // 하지만 porter는 아직 짐을 못싣는다.
        // Car 변수에 넣었기 때문에, 자동차로만 사용할 수 있다.
        // porter.addLoad();  // 에러

        // Car를 Truck이라고 생각하면 실을 수 있다.
        // (Truck) porter => porter는 일종의 Truck일 거니까
        // Truck으로 취급해라
        ((Truck) porter).addLoad(10);
        System.out.println(((Truck) porter).getLoad());

        // 만약에 자동차에 자동차를 넣어놨는데,
        Car sonata = new Car();
        // 자동차를 트럭으로 취급하려고 하면?
        // ((Truck) sonata).addLoad(10);  // 에러

        // 만약, Truck으로 취급하기 전에 Truck인지 확인하고 싶다면,
        // instanceof 키워드를 사용한다.
        if (sonata instanceof Truck) {
            ((Truck) sonata).addLoad(10);
        }
        else {
            System.out.println("can't load because not truck");
        }

        // Java 14 이후
        /*
        if (sonata instanceof Truck) {
            Truck tempTruck = (Truck) sonata;
            // 나머지 코드
        }
         */
        if (sonata instanceof Truck tempTruck) {
            tempTruck.addLoad(10);
        }
    }

//    // 짐을 싣는 메서드?
//    public static void load(Car car) {
//        car.addLoad(10); // ?
//    }

    // 주유하는 메서드
    public static void refuel(Car car) {
        car.setFuel(100);
    }
}
