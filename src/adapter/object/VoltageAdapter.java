package adapter.object;

/**
 * @PackageName: adapter.object
 * @ClassName: VoltageAdapter
 * @Description: This is VoltageAdapter class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-18 20:15
 */
public class VoltageAdapter implements Voltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int result = voltage220V.output220V();
        System.out.println("正在转换电压...");
        result = result / 44;
        System.out.println("转换成功!");
        return result;
    }
}
