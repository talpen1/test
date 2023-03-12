package Demo1;

import java.util.HashSet;
import java.util.Set;

/**
 * 加油啊，我和程序有一个能跑就行！
 *
 * @author Talpen
 * @date 2023/03/12 11:18
 **/
public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> s= new HashSet<>();
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");
//
//        Iterator<String> it =s.iterator();
//        while(it.hasNext()){
//            String st= it.next();
//            System.out.println(st);
//        }
//        for (String str : s) {
//            System.out.println(str);
//
//        }

        s.forEach(str->System.out.println(str)

        );
    }
}