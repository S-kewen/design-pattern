package quiz2;

/**
 * @PackageName: quiz2
 * @ClassName: Singleton
 * @Description: This is Singleton class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-30 19:44
 */
public class Singleton {
    private volatile static Singleton s = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if (s==null){
            synchronized (Singleton.class){
                if (s==null){
                    s = new Singleton();
                }
            }
        }
        return s;
    }
    public void operation(){
        //to do something...
    }
}
