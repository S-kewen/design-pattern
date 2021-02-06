package composite;

/**
 * @PackageName: composite
 * @ClassName: DiagramElement
 * @Description: This is DiagramElement interface by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-05 15:11
 */
public interface DiagramElement {
    void draw();
    void add(DiagramElement g);
    void remove(DiagramElement g);
    DiagramElement getChild(int index);
}
