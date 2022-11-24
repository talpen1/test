package test4;

import java.util.Objects;

public class Employee3 {
    private String name;
    private double salary;

    public Employee3(String n, Double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPrsent) {
        double raise = salary * byPrsent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee3 employee3 = (Employee3) o;
        return Double.compare(employee3.salary, salary) == 0 && Objects.equals(name, employee3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}