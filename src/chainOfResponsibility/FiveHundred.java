package chainOfResponsibility;

/**
 * @PackageName: chainOfResponsibility
 * @ClassName: OneHundred
 * @Description: This is FiveHundred class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-09 17:22
 */
public class FiveHundred extends Money {
    private int price = 500;

    public FiveHundred(Money next) {
        super(next);
    }

    @Override
    boolean hasHandler(int amount) {
        return amount >= price;
    }

    @Override
    public void help(int amount) {
        if (hasHandler(amount)) {
            int num = amount / price;
            System.out.println("取出" + price + "元 * " + num);
            if (amount % price != 0) {
                super.help(amount - (num * price));
            }
        } else {
            super.help(amount);
        }
    }
}
