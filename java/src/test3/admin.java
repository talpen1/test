package test3;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/03 00:12
 **/
public class admin extends person{
    public admin(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("管理的信息" +getName()+"   ,   " + getAge());
    }
}