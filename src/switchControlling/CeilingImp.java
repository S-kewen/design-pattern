package switchControlling;

public class CeilingImp extends SwitchImp {
    @Override
    void on() {
        System.out.println("ceiling on");
    }

    @Override
    void off() {
        System.out.println("ceiling off");
    }
}
