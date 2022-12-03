package Duotai;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/03 10:47
 **/
public class Cat extends animal {
    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的两只猫" + something);
    }

    public void catchMouse() {
        System.out.println("狗在看家");
    }
}