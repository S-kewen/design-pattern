package quiz2.servers;

/**
 * @PackageName: quiz2.servers
 * @ClassName: Server
 * @Description: This is Server interface by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 21:56
 */
public interface Server {
    void connect();
    void diagnostics();
    void reboot();
    void shotdown();
    void disconnect();
}
