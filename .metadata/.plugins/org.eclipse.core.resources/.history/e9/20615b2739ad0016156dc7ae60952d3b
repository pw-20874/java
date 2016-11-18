import java.util.*;

public class Employee implements Comparable<Employee>
{

	public Employee (String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month, day, 0, 0, 0);
		hireDay = calendar.getTime();
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
	
	public int compareTo(Employee other)
	{
		if (salary < other.salary) {
			return -1;
		} else if (salary > other.salary) {
			return 1;
		} else {
			return 0;
		}
	}
	
	private String name;
	private double salary;
	private Date hireDay;
	
}
