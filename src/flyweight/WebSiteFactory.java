package flyweight;

import java.util.HashMap;

/**
 * @PackageName: flyweight
 * @ClassName: WebSiteFactory
 * @Description: This is WebSiteFactory class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 19:24
 */
public class WebSiteFactory {
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();
    //根据网站的类型，返回一个网站，如果没有就创建一个网站，并放入池中，然后返回
    public WebSite getWebSite(String type){
        if (!pool.containsKey(type)){
            pool.put(type,new ConcreteWebSite(type));
        }
        return (WebSite)pool.get(type);
    }
    public int getWebSiteCount(){
        return pool.size();
    }
}
