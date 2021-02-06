package memento;

/**
 * @PackageName: memento
 * @ClassName: Client
 * @Description: This is Client class by Skwen.
 * @Author: Skwen
 * @Date: 2021-01-15 14:03
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        StateDiagram stateDiagram = new StateDiagram();
        Memento m = stateDiagram.createMemento();
        //do operation
        stateDiagram.setMemento(m);
    }
}
