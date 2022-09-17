package test3;
import java.io.Console;
import java.util.*;


public class test32 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);

        System.out.println("what is your name ?");
        String name=in.nextLine();
        System.out.println("How old are you?");
        int age=in.nextInt();
        System.out.println("my name is "+ name+"  I am "+age+" years old");

       // Console cons =System.console();
       // String username=cons.readLine("User name: ");
       // char[] password=cons.readPassword("Pass word: ");
        System.out.printf("Hello ,%s ! Next  year %tR,you will be %d",name,new Date(),age);

    }
}
