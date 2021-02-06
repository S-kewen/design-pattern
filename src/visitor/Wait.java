package visitor;

public class Wait extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("Man: wait");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman: wait");
    }
}
