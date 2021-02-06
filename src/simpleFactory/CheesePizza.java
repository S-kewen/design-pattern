package simpleFactory;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("起司披萨 准备完毕!");
    }
}
