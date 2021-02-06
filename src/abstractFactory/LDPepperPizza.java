package abstractFactory;

import factoryMethod.Pizza;

public class LDPepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("伦敦胡椒披萨准备完毕!");
    }
}
