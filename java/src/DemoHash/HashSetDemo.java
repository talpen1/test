package DemoHash;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2023/03/12 12:00
 **/
public class HashSetDemo {
    public static void main(String[] args) {
        Student s1 =new Student("zhangsan",23);
        Student s2 =new Student("zhangsan",23);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());  
    }

}