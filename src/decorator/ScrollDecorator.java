package decorator;

/**
 * @PackageName: decorator
 * @ClassName: ScrollDecorator
 * @Description: This is ScrollDecorator class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-09 1:44
 */
public class ScrollDecorator extends Decorator{
    @Override
    void draw() {
        System.out.println("添加滚动条");
    }
}
