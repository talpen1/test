package test3;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2022/12/03 00:13
 **/
public class personTest {
    public static void main(String[] args) {
        Student s=new Student("zhangsan",3);
        teacher t=new teacher("laosi",32);
        admin a=new admin("wangwu",2);
        rejector(s);
        rejector(t);
        rejector(a);



    }
    public  static void  rejector(person p){
        p.show();

    }
}