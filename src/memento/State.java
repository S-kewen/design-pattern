package memento;

/**
 * @PackageName: memento
 * @ClassName: State
 * @Description: This is State class by Skwen.
 * @Author: Skwen
 * @Date: 2021-01-15 13:46
 */
public class State implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object result = null;
        try {
            result = (State) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return result;
    }
}
