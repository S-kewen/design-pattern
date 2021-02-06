package strategy;

//策略模式
public class Run {
    public static void main(String[] args) {
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.setQuackBehavior(new GeGeQuackBehavior());
        pekingDuck.performQuack();
    }
}
