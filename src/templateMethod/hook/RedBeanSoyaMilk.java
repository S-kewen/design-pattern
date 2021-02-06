package templateMethod.hook;

/**
 * @PackageName: templateMethod
 * @ClassName: RedBeanSoyaMilk
 * @Description: This is RedBeanSoyaMilk class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-24 16:15
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void add() {
        System.out.println("第二步：加入红豆");
    }
}
