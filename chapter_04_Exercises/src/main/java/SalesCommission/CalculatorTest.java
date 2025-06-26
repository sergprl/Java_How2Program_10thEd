package SalesCommission;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator(1);
        calc.displayEarnings();

        calc.addItem(200.0);
        System.out.printf("Item sum: %,.2f%n", calc.getItemSum());
        calc.displayEarnings();

        calc.addItem(100);
        System.out.printf("Item sum: %,.2f%n", calc.getItemSum());
        calc.displayEarnings();
    }
}
