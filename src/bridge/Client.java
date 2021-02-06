package bridge;

public class Client {
    public static void main(String[] args) {
        ConcreteRemote concreteRemote = new ConcreteRemote(new SonyTv());
        concreteRemote.setTvName("Sony");
        System.out.println(concreteRemote.getTvName());
        concreteRemote.on();
        concreteRemote.setChannel(1);
        concreteRemote.off();

    }
}
