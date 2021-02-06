package builder;

/**
 * @PackageName: builder
 * @ClassName: HighHouse
 * @Description: This is HighHouse class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 18:56
 */
public class HighHouse extends HouseBuilder{
    @Override
    void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    void buildWalls() {
        System.out.println("高楼砌墙20厘米");
    }

    @Override
    void roofed() {
        System.out.println("高楼封顶");
    }
}
