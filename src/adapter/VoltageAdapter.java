package adapter;

/**
 * @PackageName: adapter2
 * @ClassName: VoltageAdapter
 * @Description: This is VoltageAdapter class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-18 20:01
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int output5V() {
        int result = output220V();
        System.out.println("正在转换电压...");
        result = result / 44;
        System.out.println("转换成功!");
        return result;
    }
}
