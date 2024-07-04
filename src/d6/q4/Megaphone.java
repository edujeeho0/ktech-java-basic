package d6.q4;

public class Megaphone implements NoiseMaker{
    public void siren() {
        System.out.println("쁘에에엑");
    }

    @Override
    public void makeNoise() {
        siren();
    }
}
