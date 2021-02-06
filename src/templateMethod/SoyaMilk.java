package templateMethod;

/**
 * @PackageName: templateMethod
 * @ClassName: SoyaMilk
 * @Description: This is SoyaMilk class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-24 16:09
 */
public abstract class SoyaMilk {
    public final void make(){
        select();
        add();
        soak();
        beat();
    }
    public void select(){
        System.out.println("第一步: 选择好的新鲜黄豆");
    }

    abstract void add();

    public void soak(){
        System.out.println("第三步: 浸泡黄豆和配料");
    }

    public void beat(){
        System.out.println("第四步: 打磨生成豆浆");
    }
}

