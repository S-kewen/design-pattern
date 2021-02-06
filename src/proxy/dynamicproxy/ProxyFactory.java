package proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @PackageName: proxy.dynamicproxy
 * @ClassName: ProxyFactory
 * @Description: This is ProxyFactory class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-24 15:16
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始...");
                Object result = method.invoke(target,args);
                System.out.println("JDK代理提交...");
                return result;
            }
        });
    }
}
