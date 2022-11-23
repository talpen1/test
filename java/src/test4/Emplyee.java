package test4;
import java.util.Random;

 class Employee2 {
    private final String name;
    private double salary;
    private int id;
    private static int nextID=1;

    static
{
    Random generator =new Random();
    nextID=generator.nextInt(10000);
}

    public Employee2 (String n, double s)
    {
        name=n;
        salary=s;
        id=0;

    }
    public String getName() {
        return name;
    }


    public static int getNextID() {
        return nextID;
    }


    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }



    public  void setId() {
        id = nextID;
        nextID++;
    }


}

