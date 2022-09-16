package test5;
import test4.Employee;

import java.util.Objects;

public class Manger extends Employee {
    private double bonus;

    public Manger(String n, Double s, int year, int month, int day)
    {
        super(n, s, year, month, day);
        bonus = 0;
    }
    @Override
    public double getSalary()
    {
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }

    public void setBonus(double bonus) {
       this.bonus = bonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            {return true;}
        if (o == null || getClass() != o.getClass())
            {return false;}
        Manger manger = (Manger) o;
        return Double.compare(manger.bonus, bonus) == 0;
    }


    @Override
    public int hashCode() {
        return Objects.hash(bonus);
    }
    @Override
    public String toString(){
        return super.toString()
                +"[bouns"+bonus+"]";
    }

//    @Override
//    public String toString() {
//        return "Manger{" +
//                "bonus=" + bonus +
//                '}';
//    }
}

