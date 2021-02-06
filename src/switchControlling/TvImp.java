package switchControlling;

public class TvImp extends SwitchImp {
    @Override
    void on() {
        System.out.println("tv on");
    }

    @Override
    void off() {
        System.out.println("tv off");
    }
}
