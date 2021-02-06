package singleton.lock;

/**
 * @PackageName: singleton.lock
 * @ClassName: Singleton
 * @Description: This is Singleton class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 13:01
 */
public class Singleton {
    private static Singleton s = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if (s == null){
            synchronized (Singleton.class){
                if (s == null){
                    s = new Singleton();
                }
            }
        }
        return s;
    }
}
