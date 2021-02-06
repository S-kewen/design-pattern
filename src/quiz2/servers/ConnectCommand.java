package quiz2.servers;

/**
 * @PackageName: quiz2.servers
 * @ClassName: ConnectCommand
 * @Description: This is ConnectCommand class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 22:00
 */
public class ConnectCommand extends Command{
    public ConnectCommand(Server server) {
        super(server);
    }

    @Override
    void execute() {
        super.server.connect();
    }
}
