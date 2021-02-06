package quiz2.servers;

/**
 * @PackageName: quiz2.servers
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 22:04
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Server us = new USServer();
        Server asia = new AsiaServer();
        invoker.add(new ConnectCommand(us));
        invoker.add(new ShutdownCommand(us));
        invoker.add(new DisconnectCommand(us));
        invoker.add(new DiagnosticsCommand(asia));
        invoker.run();
    }
}
