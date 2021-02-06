package proxy.staticproxy;

/**
 * @PackageName: proxy.staticproxy
 * @ClassName: TeacherDaoProxy
 * @Description: This is TeacherDaoProxy class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-24 14:57
 */
public class TeacherDaoProxy implements ITeacherDao {
    private ITeacherDao iTeacherDao;//目标对象，通过接口来聚合

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.iTeacherDao = iTeacherDao;
    }

    @Override
    public void teach() {
        System.out.println("开始代理...");
        this.iTeacherDao.teach();
        System.out.println("代理结束...");
    }
}
