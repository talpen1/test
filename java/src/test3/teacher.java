package test3;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/03 00:10
 **/
public class teacher extends person {
    public teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("老师的信息" +name+"   ,   " + age);
    }

}