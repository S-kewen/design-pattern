package builder;

/**
 * @PackageName: builder
 * @ClassName: House
 * @Description: This is House class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 18:51
 */
//product
public class House {
    private String baise;//地基
    private String wall;//墙
    private String roofed;//屋顶

    @Override
    public String toString() {
        return "House{" +
                "baise='" + baise + '\'' +
                ", wall='" + wall + '\'' +
                ", roofed='" + roofed + '\'' +
                '}';
    }

    public String getBaise() {
        return baise;
    }

    public void setBaise(String baise) {
        this.baise = baise;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
