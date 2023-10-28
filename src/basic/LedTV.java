package basic;

public class LedTV implements TV {
    @Override
    public void turnOn() {
        System.out.println("켜짐");
    }

    @Override
    public void turnOff() {
        System.out.println("꺼짐");
    }

    @Override
    public void changeVolume(int vol) {
        System.out.println("볼륨조절");
    }

    @Override
    public void changeChannel(int cha) {
        System.out.println("채널변경");
    }
}
