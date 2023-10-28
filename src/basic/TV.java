package basic;

public interface TV {
    int MIN_VOLUME = 0;
    int MAX_VOLUME = 100;
    void turnOn();
    void turnOff();
    void changeVolume(int volume);
    void changeChannel(int channel);
}
