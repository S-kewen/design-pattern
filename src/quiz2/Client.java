package quiz2;

/**
 * @PackageName: quiz2
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-30 19:46
 */
public class Client {
    public void operation(){
        Singleton s = Singleton.getInstance();
        s.operation();
    }
}
