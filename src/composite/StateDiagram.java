package composite;

import java.util.ArrayList;

/**
 * @PackageName: composite
 * @ClassName: StateDiagram
 * @Description: This is StateDiagram class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-05 15:14
 */
public class StateDiagram implements DiagramElement{
    private ArrayList<DiagramElement> lists = new ArrayList<>();
    @Override
    public void draw() {
        for(DiagramElement d : lists){
            d.draw();
        }
    }

    @Override
    public void add(DiagramElement g) {
        lists.add(g);
    }

    @Override
    public void remove(DiagramElement g) {
        lists.remove(g);
    }

    @Override
    public DiagramElement getChild(int index) {
        return lists.get(index);
    }

    @Override
    public String toString() {
        return "StateDiagram{" +
                "lists=" + lists +
                '}';
    }
}
