package test4;

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
}