package chainOfResponsibility;

/**
 * @PackageName: chainOfResponsibility
 * @ClassName: Money
 * @Description: This is Money class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-09 17:16
 */
public abstract class Money {
    private Money next = null;

    public Money(Money next) {
        this.next = next;
    }

    public Money getNext() {
        return next;
    }

    public void setNext(Money next) {
        this.next = next;
    }
    abstract boolean hasHandler(int amount);
    public void help(int amount){
        if (next!=null){
            next.help(amount);
        }else{
            System.out.println("金额异常，无法操作!");
        }
    }
}
