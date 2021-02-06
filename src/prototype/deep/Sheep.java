package prototype.deep;

import java.io.*;

/**
 * @PackageName: prototype
 * @ClassName: Sheep
 * @Description: This is Sheep class by Skwen.
 * @Author: Skwen
 * @Date: 2020-11-24 20:25
 */
public class Sheep implements Serializable, Cloneable {
    private String name;
    private int age;
    private String color;
    private Behavior behavior;

    public Sheep(String name, int age, String color, Behavior behavior) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.behavior = behavior;
    }

    public Sheep() {

    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", behavior=" + behavior +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Behavior getBehavior() {
        return behavior;
    }

    public void setBehavior(Behavior behavior) {
        this.behavior = behavior;
    }

    //方式一
//    @Override
//    protected Object clone(){
//        Sheep sheep = null;
//        try {
//            sheep = (Sheep) super.clone();
//            sheep.behavior = (Behavior) this.behavior.clone();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        return sheep;
//    }
    //方式二 通过对象的序列化实现(推荐)

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        Sheep result = null;
        try{
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois =new ObjectInputStream(bis);
            result = (Sheep) ois.readObject();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
}
