package test4;

public class ParamTest {
    public static void main(String[]areg)
    {
        System.out.println("Testing TrapValiue:");
        double prcent=10;
        System.out.println("Before"+prcent);
        tripValue(prcent);

        Employee3 a=new Employee3("Talpen1",4600.0);
        Employee3 b=new Employee3("talpen2",5000.0);
        swap(a,b);


    }
    public static void tripValue(double x)
    {
        x=3*x;
        System.out.println("X="+x);
    }
    public static void swap(Employee3 x,Employee3 y)
    {
        Employee3 temp=x;
        x=y;
        y=temp;
        System.out.println("x="+x.getName());
        System.out.println("y="+y.getName());

    }



}