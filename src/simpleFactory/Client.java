package simpleFactory;

public class Client {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza = pizzaFactory.createPizza("cheesePizza");
    }
}
