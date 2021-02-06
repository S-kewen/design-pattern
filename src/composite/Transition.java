package composite;

/**
 * @PackageName: composite
 * @ClassName: Transition
 * @Description: This is Transition class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-05 15:13
 */
public class Transition implements DiagramElement{
    @Override
    public void draw() {
        System.out.println("draw by transition...");
    }

    @Override
    public void add(DiagramElement g) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(DiagramElement g) {
        throw new UnsupportedOperationException();
    }

    @Override
    public DiagramElement getChild(int index) {
        throw new UnsupportedOperationException();
    }
}
