package test3;
import java.util.*;

import com.sun.org.apache.xpath.internal.objects.XString;

public class test31 {
    public static void main(String[] args)
    {
        System.out.println("hello world");

        String greeting="hello";

        String s=greeting.substring(0,3);
        System.out.println(greeting);
        System.out.println(s);
        String all=String.join("/","S","M","XXL");

        System.out.println(all);

        greeting=greeting.substring(0,3)+"p!";
        System.out.println(greeting);
        int n=greeting.length();

        int cpCount=greeting.codePointCount(0,greeting.length());
        System.out.println(n);
        System.out.println(cpCount);
       // int i;
        int index=greeting.offsetByCodePoints(0,4);
        int cp=greeting.codePointAt(index);
        System.out.println(cp);
        Scanner in =new Scanner(System.in);
        String name=in.nextLine();
        System.out.println(name);
    }
}
