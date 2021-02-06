package state;

/**
 * @PackageName: state
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-17 10:32
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new StartState());
        State startState = new StartState();
        startState.execute(context);
        State stopState = new StopState();
        stopState.execute(context);
    }
}
