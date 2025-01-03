package chapter_3;

public class HeartRates {
	// attributes
	private String firstName; 
	private String lastName;
	private Date dateOfBirth;
	
	// constructor
	public HeartRates(String firstName, String lastName, Date dateOfBirth)
	{
		// set the values to their initial values
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
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
	
	// date of birth
	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	// get the age of a person in years
	public double ageInYears(Date todaysDate)
	{
		double todayInYears = 
				(todaysDate.getDay()/365) + (todaysDate.getMonth()/12) + todaysDate.getYear();
		double birthInYears = 
				(dateOfBirth.getDay()/365) + (dateOfBirth.getMonth()/12) + dateOfBirth.getYear();
		
		return todayInYears - birthInYears;
	}
	
	// get the maximum heart rate of a person
	public double maximumHeartRate(Date todaysDate)
	{
		return 220 - this.ageInYears(todaysDate);
	}
	
	// get a person's target heart rate
	public String targetHeartRate(Date todaysDate)
	{
		return String.format("%.2f - %.2f", 
				(maximumHeartRate(todaysDate)*.5), (maximumHeartRate(todaysDate)*.85));
	}
}
