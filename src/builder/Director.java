package builder;

/**
 * @PackageName: builder
 * @ClassName: Director
 * @Description: This is Director class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 18:56
 */
public class Director {
    private HouseBuilder houseBuilder = null;

    public Director(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.BuildHouse();
    }
}
