package Demo1;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2023/03/11 15:46
 **/
public class LiHuaCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一个叫做"+ getName()+" 的 "+ getAge()+" " +"岁的狸花猫，在吃鱼");

    }
}