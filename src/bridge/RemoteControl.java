package bridge;

public interface RemoteControl {
    public void on();

    public void off();

    public void setChannel(int channel);

    public String getTvName();

    void setTvName(String tvName);
}
