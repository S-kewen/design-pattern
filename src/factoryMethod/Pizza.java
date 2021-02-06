package factoryMethod;

public abstract class Pizza {
    private String pizzzName;

    public abstract void prepare();

    public void cooke() {
        System.out.println(pizzzName + " cookeing!");
    }

    public void cut() {
        System.out.println(pizzzName + " cuting!");
    }

    public void pake() {
        System.out.println(pizzzName + " pakeing!");
    }

    public String getPizzzName() {
        return pizzzName;
    }

    public void setPizzzName(String pizzzName) {
        this.pizzzName = pizzzName;
    }
}
