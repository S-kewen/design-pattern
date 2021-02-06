package quiz2.servers;

/**
 * @PackageName: quiz2.servers
 * @ClassName: Command
 * @Description: This is Command class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 21:55
 */
public abstract class Command {
    protected Server server = null;

    public Command(Server server) {
        this.server = server;
    }
    abstract void execute();
}
