package test5;

public class PersonTest {
    public static void main(String[]args)
    {
        Person[] pepole=new Person[2];

        pepole[0]=new Employees("talpen",8000,1994,11,12);
        pepole[1]=new Student("Talpen","Computer");

        for(Person e:pepole)
        {
            System.out.println("name="+ e.getName()+" ," +e.getDrection());
        }
    }
    }