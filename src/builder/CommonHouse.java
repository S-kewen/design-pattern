package builder;

/**
 * @PackageName: builder
 * @ClassName: CommonHouse
 * @Description: This is CommonHouse class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 18:55
 */
public class CommonHouse extends HouseBuilder{
    @Override
    void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    void roofed() {
        System.out.println("普通房子封顶");
    }
}
