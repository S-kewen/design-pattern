package singleton;

/**
 * @PackageName: singleton
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-07 16:57
 */
public class Client {
    public static void main(String[] args) {
        //获取唯一可用的对象
        Singleton singleton = Singleton.getInstance();

        singleton.operation1();
    }
}
