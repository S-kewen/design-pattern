package switchControlling;

public class Client {
    public static void main(String[] args) {
        DimmerSwitch s = new DimmerSwitch(new LightImp());
        s.on();
    }
}
