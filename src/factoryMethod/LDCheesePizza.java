package factoryMethod;

public class LDCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("北京起司披萨准备完毕!");
    }
}
