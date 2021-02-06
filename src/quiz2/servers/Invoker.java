package quiz2.servers;

import java.util.ArrayList;

/**
 * @PackageName: quiz2.servers
 * @ClassName: Invoker
 * @Description: This is Invoker class by Skwen.
 * @Author: Skwen
 * @Date: 2020-12-08 22:03
 */
public class Invoker {
    private ArrayList<Command> list = new ArrayList<>();
    public void add(Command command){
        list.add(command);
    }
    public void run(){
        for(Command command : list){
            command.execute();
        }
        list.clear();
    }
}
