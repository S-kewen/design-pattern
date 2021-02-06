package quiz2.servers;

/**
 * @PackageName: quiz2.servers
 * @ClassName: AsiaServer
 * @Description: This is AsiaServer class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 21:57
 */
public class AsiaServer implements Server{
    private String name = "asia";

    @Override
    public void connect() {
        System.out.println(name+"-> connect");
    }

    @Override
    public void diagnostics() {
        System.out.println(name+"-> diagnostics");
    }

    @Override
    public void reboot() {
        System.out.println(name+"-> reboot");
    }

    @Override
    public void shotdown() {
        System.out.println(name+"-> shotdown");
    }

    @Override
    public void disconnect() {
        System.out.println(name+"-> disconnect");
    }
}
