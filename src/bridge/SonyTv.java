package bridge;

public class SonyTv implements TvFunction {

    @Override
    public void on() {
        System.out.println("索尼电视开机");
    }

    @Override
    public void off() {
        System.out.println("索尼电视关机");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("索尼电视切换频道-》" + channel);
    }
}
