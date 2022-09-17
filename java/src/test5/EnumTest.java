package test5;

import java.util.Locale;
import java.util.Scanner;

public class EnumTest {
    public static void main(String[]args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a size");
        String input =in.next().toUpperCase();
        Size size=Enum.valueOf(Size.class,input);
        System.out.println("size="+size);
        System.out.println("abb="+size.getAbbreviation());
    }
}
