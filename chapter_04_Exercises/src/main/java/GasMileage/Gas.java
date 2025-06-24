package GasMileage;

import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gallons = 0, miles = 0;
        boolean stop = false;

        while (!stop) {
            // get user input
            System.out.print("Enter miles driven: ");
            miles += input.nextInt();

            System.out.print("Enter gallons used: ");
            gallons += input.nextInt();

            // print results
            System.out.printf("Miles per gallon: %,.2f%n", (1.0*miles/gallons));

            // ask if the program should stop
            System.out.print("Continue? (y/n): ");
            String answer = input.next();
            answer = answer.toLowerCase();
            if (answer.equals("n")) {
                stop = true;
            }

        }
    }
}
