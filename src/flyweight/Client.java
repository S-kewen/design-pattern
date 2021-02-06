package flyweight;

/**
 * @PackageName: flyweight
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 19:29
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite w1 = webSiteFactory.getWebSite("新闻");
        w1.use();
        System.out.println(w1.toString());
        WebSite w2 = webSiteFactory.getWebSite("新闻");
        w2.use();
        System.out.println(w2.toString());
    }
}
