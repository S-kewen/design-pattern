package quiz2.servers;

/**
 * @PackageName: quiz2.servers
 * @ClassName: ConnectCommand
 * @Description: This is ShutdownCommand class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 22:00
 */
public class ShutdownCommand extends Command{
    public ShutdownCommand(Server server) {
        super(server);
    }

    @Override
    void execute() {
        super.server.shotdown();
    }
}
