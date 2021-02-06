package adapter;

/**
 * @PackageName: adapter2
 * @ClassName: Voltage220V
 * @Description: 被适配的类
 * @Author: Skwen
 * @Date: 2020-11-18 20:00
 */
public class Voltage220V {
    public int output220V(){
        System.out.println("正在输出: 220V");
        return 220;
    }
}
