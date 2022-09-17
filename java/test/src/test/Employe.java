package test;

import java.time.LocalDate;

class Employe
{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employe(String n,double s,int year,int month,int day)
	{
		name=n;
		salary=s;
		hireDay=LocalDate.of(year, month, day);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPerecent)
	{
		double raise;
		raise=salary*byPerecent/100;
		salary+=raise;
	}
	
}
