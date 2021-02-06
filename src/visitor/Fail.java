package visitor;

public class Fail extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("Man: fail");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman: fail");
    }
}
