package interface1;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/03 19:48
 **/
public class Frog extends Animal implements Swim{
    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("");

    }

    @Override
    public void swim() {

    }
}