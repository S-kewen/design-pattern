package chainOfResponsibility;

/**
 * @PackageName: chainOfResponsibility
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-09 17:29
 */
public class Client {
    public static void main(String[] args) {
        Money atm = new TenHundred(new FiveHundred(new OneHundred(null)));
        atm.help(12700);
    }
}
