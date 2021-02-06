package flyweight;

/**
 * @PackageName: flyweight
 * @ClassName: ConcreteWebSite
 * @Description: This is ConcreteWebSite class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 19:22
 */
public class ConcreteWebSite extends WebSite{
    private String type = null;//网站类型

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    void use() {
        System.out.println("网站类型："+type);
    }
}
