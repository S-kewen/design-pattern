package visitor;

public class Success extends Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("Man: success");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("Woman: success");
    }
}
