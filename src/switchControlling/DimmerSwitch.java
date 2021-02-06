package switchControlling;

public class DimmerSwitch extends Switch {
    public DimmerSwitch(SwitchImp switchImp) {
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
