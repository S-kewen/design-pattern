package observer;

public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("主动推送");
        System.out.println("当前温度：" + this.temperature);
        System.out.println("当前湿度：" + this.humidity);
        System.out.println("当前气压：" + this.pressure);
        System.out.println("主动推送结束");
    }
}
