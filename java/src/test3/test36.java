package test3;
import java.util.*;

public class test36 {
    public  static void main(String[]args)
    {

    int a=calcArea(7,12);
    //calcArea x=new calcArea();

    System.out.println(calcArea(2,3));
        Scanner in=new Scanner(System.in);

        int n= in.nextInt();
        int k= in.nextInt();

        int[] number= new int[n];
        for(int i=0;i<number.length;i++)
            number[i]=i+1;

        int[]result =new int[k];
        for(int i=0;i<result.length;i++)
        {
            System.out.println(calcArea(2,3));
            int r=(int)(Math.random()*n);
            result[i]=number[r];
            System.out.println(result[i]);
            number[r]=number[n-1];
        }


    }

    private static int calcArea(int h, int w) {
        return h*w;
    }
}
