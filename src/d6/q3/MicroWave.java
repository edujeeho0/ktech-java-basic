package d6.q3;

public class MicroWave
    implements Switchable, CookingUtensil {
    private boolean onOff;

    @Override
    public void hitSwitch() {
        onOff = !onOff;
    }

    @Override
    public void cook() {
        if (!onOff)
            throw new RuntimeException("Microwave is not on");
        System.out.println("Now start cooking...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        System.out.println("Finish cooking");
    }
}
