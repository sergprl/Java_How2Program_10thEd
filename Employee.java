package chapter_3;

// Exercise 3.13

public class Employee {
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	// constructor
	public Employee(String firstName, String lastName, double monthlySalary)
	{
		// set first name
		this.firstName = firstName;
		
		// set last name
		this.lastName = lastName;
		
		// set monthly salary if the value is greater than 0
		if (monthlySalary > 0)
			this.monthlySalary = monthlySalary;		
	}
	
	// first name
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	// last name
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	// monthly salary
	public void setMonthlySalary(double monthlySalary)
	{
		if (monthlySalary > 0)
			this.monthlySalary = monthlySalary;
		else
			System.out.printf("Monthly salary should be a positive number. The value entered was $%.2f%n",
					monthlySalary);
	}
	
	public double getMonthlySalary()
	{
		return this.monthlySalary;
	}
	
	// get the yearly salary of the Employee
	public double getYearlySalary()
	{
		return this.monthlySalary * 12;
	}
	
	// give a percentage increase in the salary
	public void givePercentageSalaryIncrease(double percentage)
	{
		monthlySalary = monthlySalary * (1 + (percentage/100));
	}
}
