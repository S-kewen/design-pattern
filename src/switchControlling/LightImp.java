package switchControlling;

public class LightImp extends SwitchImp {
    @Override
    void on() {
        System.out.println("light on");
    }

    @Override
    void off() {
        System.out.println("light off");
    }
}
