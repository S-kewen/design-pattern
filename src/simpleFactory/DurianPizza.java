package simpleFactory;

public class DurianPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("榴莲披萨 准备完毕!");
    }
}
