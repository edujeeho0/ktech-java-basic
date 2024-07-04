package d6.q3;

// TV는 전원을 키고, 소리가 나고, 화면이 나온다.
public class Television
    implements Switchable, PlaySound, Display {
    private boolean onOff;

    @Override
    public void hitSwitch() {
        // 스위치를 누를때마다
        // 전원이 켜졌다 꺼졌다 한다.
        onOff = !onOff;
    }

    @Override
    public void showDisplay() {
        if (!onOff)
            throw new RuntimeException("TV is not on");
        System.out.println("Now Playing 유퀴즈");
    }

    @Override
    public void playSound() {
        if (!onOff)
            throw new RuntimeException("TV is not on");
        System.out.println("Play sound of 유퀴즈");
    }
}
