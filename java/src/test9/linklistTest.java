package test9;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 加油啊，我和程序有一个能跑就行！20231112
 *
 * @author Talpen
 * @date 2022/11/22 01:06
 **/
public class linklistTest {
    public static void main(String[] args)
    {
        List<String> a= new LinkedList<>();
        a.add("talpen");
        a.add("talpen1");
        a.add("talpen2");
        List<String> b = new LinkedList<>();
        b.add("talpen3");
        b.add("talpen4");
        b.add("talpen5");

        ListIterator<String> aIter=a.listIterator();
        ListIterator<String> bIter=b.listIterator();

        System.out.println(b);

        while (bIter.hasNext())
        {
            if(aIter.hasNext())
                aIter.next();
            aIter.add(bIter.next());
        }

        System.out.println(a);
        System.out.println(b);
        while(bIter.hasPrevious())
        {
            bIter.previous();
        }
        while(bIter.hasNext())
        {
            bIter.next();

            if(bIter.hasNext())
            {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);




    }
}