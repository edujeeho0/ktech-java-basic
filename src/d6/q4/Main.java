package d6.q4;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.horn();

        Ship ship = new Ship();
        ship.fogHorn();

        Megaphone megaphone = new Megaphone();
        megaphone.siren();

        NoiseMaker[] noises = { car, ship, megaphone };
        soundAll(noises);
    }

    public static void soundAll(NoiseMaker[] noiseMakers) {
        System.out.println("");
        for (NoiseMaker maker: noiseMakers)
            maker.makeNoise();
    }
}
