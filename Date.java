package chapter_3;

// Exercise 3.14

public class Date {
	// attributes
	private int day;
	private int month;
	private int year;
	
	// constructor
	public Date(int day, int month, int year)
	{
		// validate the entries and assign them if they are valid
		if (day > 0 && day < 32)
			this.day = day;
		if (month > 0 && month < 13)
			this.month = month;
		if (year > 0)
			this.year = year;
	}
	
	// day
	public void setDay(int day)
	{
		if (day > 0 && day < 32)
			this.day = day;
	}
	public int getDay()
	{
		return day;
	}
	
	// month
	public void setMonth(int month)
	{
		if (month > 0 && month < 13)
			this.month = month;
	}
	public int getMonth()
	{
		return month;
	}
	
	// year
	public void setYear(int year)
	{
		if (year > 0)
			this.year = year;
	}
	public int getYear()
	{
		return year;
	}
	
	// display date in dd/mm/yyyy format
	public void displayDate()
	{
		// print a formatted string
		System.out.printf("%d/%d/%d%n%n", day, month, year);
	}
	
	// display date in dd/mm/yyyy format
	public String getDateString()
	{
		// print a formatted string
		return String.format("%d/%d/%d%", day, month, year);
	}
	
}
