package simpleFactory;

public abstract class Pizza {
    private String pizzaName;

    public abstract void prepare();

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public void cooke() {
        System.out.println(pizzaName + " cookeing!");
    }

    public void cut() {
        System.out.println(pizzaName + " cuting!");
    }

    public void pack() {
        System.out.println(pizzaName + " packing!");
    }
}
