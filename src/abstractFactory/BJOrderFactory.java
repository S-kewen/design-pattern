package abstractFactory;

import factoryMethod.OrderFactory;
import factoryMethod.Pizza;

public class BJOrderFactory extends OrderFactory {

    @Override
    public Pizza createPizza(String pizzaName) {
        Pizza pizza = null;

        if (pizzaName.equals("cheese")) {
            pizza = new BJCheesePizza();
            pizza.setPizzzName("北京起司披萨");
        } else if (pizzaName.equals("pepper")) {
            pizza = new BJPepperPizza();
            pizza.setPizzzName("北京胡椒披萨");
        }
        if (pizza != null) {
            pizza.cooke();
            pizza.cut();
            pizza.pake();
        }
        return pizza;
    }
}
