package test4;
import java.time.*;
public class test42 {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("talpen0", 7500, 1994, 11, 12);
        staff[1] = new Employee("talpen1", 7600, 1994, 11, 12);
        staff[2] = new Employee("talpen2", 7700, 1994, 11, 12);

        for (Employee e : staff)
            e.raiseSalary(5.0);

        for (Employee e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + "   salary=" + e.getSalary() + "   hireDay=" + e.getHireDay() + e.getId());

        }
    }
}
