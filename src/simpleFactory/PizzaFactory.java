package simpleFactory;

public class PizzaFactory {
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals("cheesePizza")) {
            pizza = new CheesePizza();
            pizza.setPizzaName("起司披萨");
        } else if (pizzaType.equals("DurianPizza")) {
            pizza = new DurianPizza();
            pizza.setPizzaName("榴莲披萨");
        } else {
            System.out.println("该披萨种类不存在");
            return pizza;
        }
        pizza.prepare();
        pizza.cooke();
        pizza.cut();
        pizza.pack();
        return pizza;
    }
}
