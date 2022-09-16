package test6;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee3  implements Comparable<Employee3>,Cloneable {
    private String name;
    private int salary;
    private int age;
    private Date hireDay;

    public Employee3(String name, int salary, int age) throws CloneNotSupportedException {
        this.name = name;
        this.salary = salary;
        this.age = age;
        hireDay=new Date();
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void raiseSalary(double byPrsent) {
        double raise = salary * byPrsent / 100;
        salary += raise;
    }
    public Employee3 clone() throws CloneNotSupportedException {
        Employee3 cloned = (Employee3) super.clone();
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }


    public int compareTo(Employee3 other) {
        return Double.compare(salary, other.salary);
    }

    public void setHireDay(int year ,int month,int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime((newHireDay.getTime()));
    }

}
