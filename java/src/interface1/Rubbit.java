package interface1;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/03 19:44
 **/
public class Rubbit extends Animal{

    public Rubbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat()
    {
        System.out.println("兔子吃东西");
    }


}