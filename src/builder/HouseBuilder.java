package builder;

/**
 * @PackageName: builder
 * @ClassName: HouseBuilder
 * @Description: This is HouseBuilder class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 18:52
 */
//builder
public abstract class HouseBuilder {
    protected House house = new House();

    abstract void buildBasic();

    abstract void buildWalls();

    abstract void roofed();

    public House BuildHouse() {
        return house;
    }
}
