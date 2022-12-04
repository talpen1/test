package interface1;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/04 14:01
 **/
public class Test {
    public static void main(String[] args) {
        Frog f=new Frog("青蛙",1);
        System.out.println(f.getName()+" ," + f.getAge());
        f.eat();
        f.swim();

        Rubbit r=new Rubbit("小白",2);
        System.out.println(r.getName()+" ," + r.getAge());
        r.eat();

    }

}