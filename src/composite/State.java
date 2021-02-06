package composite;

/**
 * @PackageName: composite
 * @ClassName: State
 * @Description: This is State class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-05 15:12
 */
public class State implements DiagramElement{
    @Override
    public void draw() {
        System.out.println("draw by State...");
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
