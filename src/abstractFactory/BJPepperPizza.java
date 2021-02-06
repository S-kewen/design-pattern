package abstractFactory;

import factoryMethod.Pizza;

public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("北京胡椒披萨准备完毕!");
    }
}
