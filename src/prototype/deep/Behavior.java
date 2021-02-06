package prototype.deep;

/**
 * @PackageName: prototype.deep
 * @ClassName: Behavior
 * @Description: This is Behavior class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-05 23:52
 */
public class Behavior implements Cloneable{
    private String name;
    private int level;

    public Behavior(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
