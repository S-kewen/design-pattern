package abstractFactory;

import factoryMethod.Pizza;

public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("北京起司披萨准备完毕!");
    }
}
 