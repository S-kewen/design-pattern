package state;

/**
 * @PackageName: state
 * @ClassName: StopState
 * @Description: This is StopState class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-17 10:32
 */
public class StopState implements State{
    @Override
    public void execute(Context context) {
        System.out.println("player is stop!!");
    }
    public String toString() {
        return "Stop State";
    }
}
