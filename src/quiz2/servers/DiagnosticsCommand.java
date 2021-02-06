package quiz2.servers;

/**
 * @PackageName: quiz2.servers
 * @ClassName: ConnectCommand
 * @Description: This is DiagnosticsCommand class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 22:00
 */
public class DiagnosticsCommand extends Command{
    public DiagnosticsCommand(Server server) {
        super(server);
    }

    @Override
    void execute() {
        super.server.diagnostics();
    }
}
