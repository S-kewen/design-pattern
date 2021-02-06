package singleton;

/**
 * @PackageName: singleton
 * @ClassName: Singleton
 * @Description: This is Singleton class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-07 16:50
 */
public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void operation1(){
        System.out.println("do something...");
    }
}
