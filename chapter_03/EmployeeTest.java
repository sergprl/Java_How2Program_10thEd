package chapter_3;

// Exercise 3.13

public class EmployeeTest {
	public static void main(String[] args)
	{
		// Create two Employee objects and display each object’s yearly salary
		Employee worker1 = new Employee("Pedro", "Jimenez", 150.5);
		Employee worker2 = new Employee("Hannah", "Smith", 750.50);
		
		// print the data of each
		printEmployeeData(worker1);
		printEmployeeData(worker2);
		
		// give a 10% raise to each employee
		System.out.println("\n\nIncrease in salary!\n");
		worker1.givePercentageSalaryIncrease(10);
		worker2.givePercentageSalaryIncrease(10);
		
		// print the new data of each
		printEmployeeData(worker1);
		printEmployeeData(worker2);
	}
	
	public static void printEmployeeData(Employee employee)
	{
		System.out.printf("First Name: %s%n"
				+ "Last Name: %s%n"
				+ "Yearly Salary: $%.2f%n%n", 
				employee.getFirstName(), employee.getLastName(), employee.getYearlySalary());
	}
}
