package test5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class arreyListTest {
    public static void main(String[]args)
    {
        ArrayList<Employe> staff=new ArrayList<>();
        staff.add(new Employe("talpe0",7500,1994,11,12));
        staff.add(new Employe("talpen1",7600,1994,11,12));
        staff.add(0,new Employe("talpen2",7600,1994,11,12));

        for(Employe e:staff)
        {
            e.raiseSalary(5);
        }
        for(Employe e:staff)
        {
            System.out.println(e.getName()+e.getSalary()+e.getHireDay());
        }
    }
}
