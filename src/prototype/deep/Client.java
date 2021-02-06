package prototype.deep;

/**
 * @PackageName: prototype.deep
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-05 23:57
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("xyy", 10, "red", new Behavior("打架", 1));
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep.toString());
        System.out.println(sheep2.toString());
    }
}
