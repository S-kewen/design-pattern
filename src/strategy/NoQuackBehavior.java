package strategy;

public class NoQuackBehavior implements QuackBehavior {
    public void quack() {
        System.out.println("no quack");
    }
}
