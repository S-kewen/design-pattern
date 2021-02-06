package strategy;

public class NoFlyBehavior implements FlyBehavior {
    public void fly() {
        System.out.println("no fly");
    }
}
