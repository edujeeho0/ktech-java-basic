package d6.q3;

/*
여러 전자제품을 나타내는 클래스,
Television, Computer, Stereo, Induction, MicroWave을 만들어 보고,

전원을 켰다 끌 수 있음을 나타내는 Switchable
소리를 낼 수 있음을 나타내는 PlaySound
영상을 보여줄 수 있음을 나타내는 Display
요리가 가능함을 나타내는 CookingUtensil

등의 인터페이스를 이용해 각 가전제품의 기능을 구현해보자.
 */
public class Main {
    public static void main(String[] args) {
        MicroWave microWave = new MicroWave();
        microWave.hitSwitch();
        microWave.cook();

        Television tv = new Television();
        tv.hitSwitch();
        tv.playSound();
        tv.showDisplay();

        Switchable[] machines = {microWave, tv};
        hitAllSwitch(machines);
        tv.showDisplay();
    }

    public static void hitAllSwitch(Switchable[] machines) {
        for (Switchable machine: machines)
            machine.hitSwitch();
    }
}
