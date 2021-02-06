package prototype;

/**
 * @PackageName: prototype
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-24 20:30
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("Tom",21,"白色");
        System.out.println(sheep.toString());
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep2.toString());
    }
}
