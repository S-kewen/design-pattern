package switchControlling;

public abstract class Switch {
    public SwitchImp switchImp;

    public Switch(SwitchImp switchImp) {
        this.switchImp = switchImp;
    }

    abstract void on();

    abstract void off();
}
