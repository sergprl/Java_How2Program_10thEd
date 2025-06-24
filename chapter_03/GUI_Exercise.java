package chapter_3;

// page 92

import javax.swing.JOptionPane;

public class GUI_Exercise {
	public static void main(String[] args)
	{
		int number1; // first number to add
		int number2; // second number to add
		int sum; // sum of number1 and number2
		
		// get the integers from the user
		number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer:"));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer:"));
		
		// perform the addition
		sum = number1 + number2;
		
		// show the result to the user
		String message = String.format("Sum is %d", sum);
		JOptionPane.showMessageDialog(null, message);
	}
}
