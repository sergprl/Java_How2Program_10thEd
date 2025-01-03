package chapter_3;

// Exercise 3.14
// Test Date's capabilities

public class DateTest {
	public static void main(String[] args)
	{
		// create a date object
		Date date1 = new Date(23, 01, 2004);
		
		// print the date
		date1.displayDate();
		
		// modify date1
		date1.setDay(5);
		date1.setMonth(12);
		date1.setYear(1999);
		
		// print the date
		System.out.println("Date modified");
		date1.displayDate();
	}
}
