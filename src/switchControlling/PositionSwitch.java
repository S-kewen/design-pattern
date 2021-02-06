package switchControlling;

public class PositionSwitch extends Switch {
    public PositionSwitch(SwitchImp switchImp) {
        super(switchImp);
    }

    @Override
    public void on() {
        switchImp.on();
    }

    @Override
    public void off() {
        switchImp.off();
    }
}
