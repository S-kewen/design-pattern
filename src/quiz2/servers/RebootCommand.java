package quiz2.servers;

/**
 * @PackageName: quiz2.servers
 * @ClassName: ConnectCommand
 * @Description: This is RebootCommand class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 22:00
 */
public class RebootCommand extends Command{
    public RebootCommand(Server server) {
        super(server);
    }

    @Override
    void execute() {
        super.server.reboot();
    }
}
