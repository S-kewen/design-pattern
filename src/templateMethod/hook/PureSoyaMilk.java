package templateMethod.hook;

/**
 * @PackageName: templateMethod.hook
 * @ClassName: PureSoyaMilk
 * @Description: This is PureSoyaMilk class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-24 16:32
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void add() {
        throw new UnsupportedOperationException();
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
