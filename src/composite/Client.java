package composite;

import java.awt.*;

/**
 * @PackageName: composite
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-05 15:15
 */
public class Client {
    public static void main(String[] args) {
        DiagramElement stateDiagram = new StateDiagram();
        stateDiagram.add(new State());
        stateDiagram.add(new State());
        stateDiagram.add(new State());
        stateDiagram.add(new Transition());
        System.out.println(stateDiagram.toString());;
    }

}
