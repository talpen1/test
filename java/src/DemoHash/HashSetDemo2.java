package DemoHash;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2023/03/12 14:29
 **/
public class HashSetDemo2 {
    public static void main(String[] args) {

        HashSet<Student> hs =new HashSet<>();

        Student s1=new Student("zhangsan",23);
        Student s2=new Student("lisi",23);
        Student s3=new Student("wangwu",23);
        Student s4=new Student("zhangsan",23);



        System.out.print(hs.add(s1));
        System.out.print(hs.add(s2));
        System.out.print(hs.add(s3));
        System.out.print(hs.add(s4));

        Iterator<Student> it = hs.iterator();
        while(it.hasNext()){
            Student s=it.next();
            System.out.print(s.getAge());
        }
        hs.forEach(i->System.out.println(i));
    }
}