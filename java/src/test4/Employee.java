package test4;

import java.time.LocalDate;
public class Employee {
    private static int nextID=1;
    private String name;
    private double salary;
    private LocalDate hireDay;
    private int id;

    public Employee(String name, double salary, int year,int month,int day)
    {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
        id=0;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double byPrsent) {
        double raise=salary*byPrsent/100;
        salary+=raise;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public double getSalary() {
        return salary;
    }

    //    public static int getNextID() {
//        return nextID;
//    }
    public int getId() {
        return id;
    }

    public void setId() {
        id=nextID;
        nextID++;
    }
}