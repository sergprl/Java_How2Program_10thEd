package chapter_04;
import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int counter = 1;
		
		while (counter <= 10) 
		{
			System.out.print("Enter a grade: ");
			int grade = input.nextInt();
			total = total + grade;
			counter = counter + 1;
		}
		
		System.out.printf("Total of 10 grades is %d%n", total);
		double average = total / 10.0;
		System.out.printf("%nClass average: %.2f%n", average);
		
		input.close();
	}
}
