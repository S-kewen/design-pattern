package factoryMethod;

public class Client {
    public static void main(String[] args) {
        BJOrderFactory bjOrderFactory = new BJOrderFactory();
        bjOrderFactory.createPizza("cheese");
    }
}
