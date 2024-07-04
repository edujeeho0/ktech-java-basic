package d6.q4;

public class Car implements NoiseMaker {
    public void horn() {
        System.out.println("빵빵");
    }

    @Override
    public void makeNoise() {
        horn();
    }
}
