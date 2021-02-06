package quiz2.servers;

/**
 * @PackageName: quiz2.servers
 * @ClassName: ConnectCommand
 * @Description: This is DisconnectCommand class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 22:00
 */
public class DisconnectCommand extends Command{
    public DisconnectCommand(Server server) {
        super(server);
    }

    @Override
    void execute() {
        super.server.disconnect();
    }
}
