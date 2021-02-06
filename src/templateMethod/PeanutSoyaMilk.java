package templateMethod;

/**
 * @PackageName: templateMethod
 * @ClassName: PeanutSoyaMilk
 * @Description: This is PeanutSoyaMilk class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-24 16:16
 */
public class PeanutSoyaMilk extends SoyaMilk{
    @Override
    void add() {
        System.out.println("第二步：加入花生");
    }
}
