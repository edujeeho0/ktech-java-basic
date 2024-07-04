package d6.q4;

public class Ship implements NoiseMaker {
    public void fogHorn() {
        System.out.println("부아아아앙");
    }

    @Override
    public void makeNoise() {
        fogHorn();
    }
}
