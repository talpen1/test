package Duotai;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/03 10:49
 **/
public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
//    public void keepPet(Dog dog,String something){
//        System.out.println("年龄为"+age+"岁"+name+"养了"+dog.getColor()+"颜色的"+dog.getAge()+"的狗");
//        dog.eat(something);
//    }
//    public void keepPet(Cat cat,String something){
//        System.out.println("年龄为"+age+"岁"+name+"养了"+cat.getColor()+"颜色的"+cat.getAge()+"的mao");
//        cat.eat(something);// }
public void keepPet(animal a,String something) {
    if (a instanceof Dog ) {
        Dog D = (Dog) a;
        System.out.println("年龄为" + age + "岁" + name + "养了" + a.getColor() + "颜色的" + a.getAge() + "的狗");
        D.eat(something);
    }
    else if(a instanceof Cat ) {
        Cat C = (Cat) a;
        System.out.println("年龄为" + age + "岁" + name + "养了" + a.getColor() + "颜色的" + a.getAge() + "的狗");
        C.eat(something);
    }
}

}
