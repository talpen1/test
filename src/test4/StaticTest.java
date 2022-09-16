package test4;

public class StaticTest {


    public static void main(String[] args)
    {
        Employee2[] staff =new Employee2[3];

        staff[0]=new Employee2("talpen",40000);
        staff[1]=new Employee2("talpen1",50000);
        staff[2]=new Employee2("talpen2",60000);


        for(Employee2 e:staff)
        {
            e.setId();
            System.out.println("name="+e.getName()+ "  id="+e.getId()+" salary="+e.getSalary());
        }
        int n=Employee2.getNextID();
        System.out.println("Next ID is "+n);
    }
}

