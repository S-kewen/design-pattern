package memento;

/**
 * @PackageName: memento
 * @ClassName: StateDiagram
 * @Description: This is StateDiagram class by Skwen.
 * @Author: Skwen
 * @Date: 2021-01-15 13:57
 */
public class StateDiagram {
    private String pass;
    private State state;
    public Memento createMemento() throws CloneNotSupportedException {
        State s = (DiagramState)state.clone();
        Memento m = new Memento(s,pass);
        return m;
    }
    public void setMemento(Memento m){
        try{
            this.state=m.getState(pass);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
