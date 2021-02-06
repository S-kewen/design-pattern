package adapter.object;

/**
 * @PackageName: adapter.object
 * @ClassName: Phone
 * @Description: This is Phone class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-18 20:17
 */
public class Phone {
    public void recharge(VoltageAdapter voltageAdapter) {
        int result = voltageAdapter.output5V();
        if (result == 5) {
            System.out.println("正在充电...");
        } else {
            System.out.println("电压异常，无法充电!");
        }

    }
}
