package bridge;

public class ConcreteRemote implements RemoteControl {
    private String mTvName;
    // 與電視廠商相依的行為已經被封裝起來,
    // 搖控器不用管這些行為如何實作的
    private TvFunction mTvFunction;

    public ConcreteRemote(TvFunction tvFunction) {
        // 只要替換掉 tvFucntion,
        // 就能操作不同廠商的電視
        mTvFunction = tvFunction;

    }

    @Override
    public void on() {
        mTvFunction.on();
    }

    @Override
    public void off() {
        mTvFunction.off();
    }

    @Override
    public void setChannel(int channel) {
        mTvFunction.setChannel(channel);
    }

    @Override
    public String getTvName() {
        return this.mTvName;
    }

    @Override
    public void setTvName(String tvName) {
        this.mTvName = tvName;
    }
}
