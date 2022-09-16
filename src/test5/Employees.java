package test5;

import java.time.LocalDate;

public class Employees extends Person{
    private double salary;
    private LocalDate hireDay;

    public Employees(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDrection() {
        return String.format("an emplyee with a salary of $%.2f",salary);
    }

    public void raiseSalary(double byPrsent)
    {
        double raise=salary*byPrsent/100;
        salary+=raise;

    }


}
