package chapter_04;

public class Student {
	private String name;
	private double grade;
	
	public Student(String name, double grade)
	{
		this.name = name; // no validation needed
		
		// validate that the grade is within valid ranges
		if(grade > 0.0)
			if(grade <= 100.00)
				this.grade = grade;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setGrade(double grade)
	{
		if (grade > 0.0)
			if (grade <= 100.00)
				this.grade = grade;
	}
	public double getGrade()
	{
		return grade;
	}
	
	public String getLetterGrade()
	{
		String letterGrade = "";
		
		if (grade >= 90.00)
			letterGrade = "A";
		else if (grade >= 80.0)
			letterGrade = "B";
		else if (grade >= 70.0)
			letterGrade = "C";
		else if (grade >= 60.0)
			letterGrade = "D";
		else 
			letterGrade = "F";
		
		return letterGrade;
	}
}
