package proxy.dynamicproxy;

/**
 * @PackageName: proxy.dynamicproxy
 * @ClassName: TeacherDao
 * @Description: This is TeacherDao class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-24 15:15
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
