package switchControlling;

public class PullChainSwitch extends Switch {
    public PullChainSwitch(SwitchImp switchImp) {
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
