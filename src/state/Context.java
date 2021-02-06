package state;

/**
 * @PackageName: state
 * @ClassName: Context
 * @Description: This is Context class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-17 10:30
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Context(State state) {
        this.state = state;
    }
}
