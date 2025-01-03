package chapter_3;

import javax.swing.JOptionPane;

public class HeartRatesTest {

	public static void main(String[] args) {
		// create a HeartRates object
		HeartRates heartRate = setUpHeartRateData();
		
		// print the information of the heart rate object
		System.out.println(getHeartRatesInfo(heartRate, new Date(3,1,2025)));

	}

	// get information for heart rate from user
	public static HeartRates setUpHeartRateData()
	{
		String firstName = JOptionPane.showInputDialog("Enter first name:");
		String lastName = JOptionPane.showInputDialog("Enter last name:");
		int dayOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter day of birth:"));
		
		if (dayOfBirth < 0 || dayOfBirth > 31)
			JOptionPane.showMessageDialog(null, "Incorrect day, setting to 0"); 
											// setting to 0 is managed by "Date" class
		int monthOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter month of birth:"));
		if (monthOfBirth < 0 || monthOfBirth > 12)
			JOptionPane.showMessageDialog(null, "Incorrect month, setting to 0");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog("Enter year of birth:"));
		if (yearOfBirth < 1920)
			JOptionPane.showMessageDialog(null, "What's your secret?");
		
		HeartRates heartRate = new HeartRates(
				firstName, lastName, new Date(dayOfBirth, monthOfBirth, yearOfBirth));
		return heartRate;
	}
	
	// print the information of a HeartRates object
	public static String getHeartRatesInfo(HeartRates heartRate, Date todaysDate)
	{
		return String.format(
				"First Name: %s%n"
				+ "Last Name: %s%n"
				+ "Date of Birth: %s%n"
				+ "Age in years: %f%n"
				+ "Maximum Heart Rate: %.2f%n"
				+ "Target Heart Rate Range: %s%n%n",
				heartRate.getFirstName(),
				heartRate.getLastName(),
				heartRate.getDateOfBirth().getDateString(),
				heartRate.ageInYears(todaysDate),
				heartRate.maximumHeartRate(todaysDate),
				heartRate.targetHeartRate(todaysDate));
	}
	
}
