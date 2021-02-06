package adapter;

/**
 * @PackageName: adapter2
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-18 20:04
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.recharge(new VoltageAdapter());
    }
}
