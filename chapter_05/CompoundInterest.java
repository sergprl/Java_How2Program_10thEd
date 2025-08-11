public class CompoundInterest {
    public static void main (String[] args) {
        int amount;
        int principal = 100000; // pennies and amount = 1000.00
        double rate = 0.05;

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; ++year)
        {
            // calculate new amount for specified year
            amount = (int) (principal * Math.pow(1.0 + rate, year));

            // display the year and the amount
            System.out.printf("%4d%,18d.%2d%n", year, amount/100, amount%100);
        }
    }
}
