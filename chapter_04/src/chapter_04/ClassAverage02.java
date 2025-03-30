package chapter_04;

import java.util.Scanner;

public class ClassAverage02 {
	public static void main(String[] args)
	{
		// create scanner
		Scanner input = new Scanner(System.in);
		
		// initialization
		int total = 0;
		int counter = 0;
		
		// input, sum and count the quiz grades
		System.out.print("Enter grade (enter -1 if no more grades left): ");
		int value = input.nextInt();
		while (value != -1)
		{
			total += value;
			counter += 1;
			System.out.print("Enter grade (enter -1 if no more grades left): ");
			value = input.nextInt();
		}
			
		// calculate and print the class average
		if (counter != 0) 
		{
			double average = (double)total/counter;
			System.out.printf("The average is: %.2f%n", average);
		}
		else
			System.out.println("No grades were entered");
	}
}
