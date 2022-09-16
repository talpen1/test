package test5;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.Objects;

public class Employe {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employe(String name, double salary, int year ,int month,int day)
    {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPrsent)
    {
        double raise=salary*byPrsent/100;
        salary+=raise;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Employe employe = (Employe) otherObject;
        return Double.compare(employe.salary, salary) == 0 && Objects.equals(name, employe.name) && Objects.equals(hireDay, employe.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
    
}
