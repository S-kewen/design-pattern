package adapter.object;

/**
 * @PackageName: adapter.object
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-18 20:18
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.recharge(new VoltageAdapter(new Voltage220V()));
    }
}
