package test;

import java.time.LocalDate;
public class test2 {
	public static void main(String[]args)
	{
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		Employe[]staff=new Employe[3];
		staff[0]=new Employe("Talpen",1200,year,month,today);
		staff[1]=new Employe("Talpen2",1100,year,month,today);
		staff[2]=new Employe("Talpen2",1000,year,month,today);
		
		
		for(Employe e:staff)
			e.raiseSalary(5);
		for(Employe e:staff)
		{
			System.out.println("name=" + e.getName()+", salary="+e.getSalary()+",hireday "+e.getHireDay());
		}
	}

}

