package proxy.dynamicproxy;

/**
 * @PackageName: proxy.dynamicproxy
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-24 15:25
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        System.out.println("proxyInstance = "+proxyInstance.getClass());
        proxyInstance.teach();
    }
}
