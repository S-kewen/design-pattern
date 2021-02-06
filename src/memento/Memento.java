package memento;

/**
 * @PackageName: memento
 * @ClassName: Memento
 * @Description: This is Memento class by Skwen.
 * @Author: Skwen
 * @Date: 2021-01-15 13:44
 */
public class Memento {
    private int pass;
    private State state;

    public State getState(String pass) throws IllegalAccessException {
        if (this.pass == pass.hashCode()) {
            return state;
        } else {
            throw new IllegalAccessException();
        }
    }

    public Memento(State s, String pass) {
        this.state = s;
        this.pass = pass.hashCode();
    }
}
