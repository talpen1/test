package test5;
import test4.*;
public class ManagerTest {
    public static void main(String[] args) {
        Manger boss = new Manger("TALPEN", 80000.0, 1994, 11, 12);
        boss.setBonus(5000);
        Employee[] staff=new Employee[3];
        staff[0]=boss;
        staff[1]=new Employee("talpen2", 50000.0,1989,10,11);
        staff[2]=new Employee("talpen3", 75000.0,1988,11,15);

        for(Employee e:staff)
        {
            System.out.println("name="+e.getName()+"  salary="+e.getSalary());
        }
    }
}
