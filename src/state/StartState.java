package state;

/**
 * @PackageName: state
 * @ClassName: StartState
 * @Description: This is StartState class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-17 10:31
 */
public class StartState implements State{
    @Override
    public void execute(Context context) {
        System.out.println("player is start!!");
    }
    public String toString() {
        return "Start State";
    }
}

