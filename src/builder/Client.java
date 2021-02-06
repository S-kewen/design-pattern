package builder;

/**
 * @PackageName: builder
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 18:59
 */
public class Client {
    public static void main(String[] args) {
        HouseBuilder commonHouse = new CommonHouse();
        Director director = new Director(commonHouse);
        System.out.println(director.constructHouse().toString());

    }
}
