package test3;
import java.awt.*;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.*;
public class test33
{
    public static void  main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        System.out.println("What is your name?");
        //String name=in.nextLine();
        System.out.println("How old are you ?" );
        //int age=in.nextInt();
        //System.out.printf("My name is %s,I am %d yeas old",name,age);
        System.out.printf("%1$s %2$tY，%2$tB %2$te ","Due date",new Date());

        //Scanner in1=new Scanner(Paths.get("myfile.txt"),"UTF-8");
        //String file =in1.nextLine();
      //  System.out.println(file);


        PrintWriter out1 =new PrintWriter("myfile.txt","UTF-8");
        out1.println("hello");
    }
}
