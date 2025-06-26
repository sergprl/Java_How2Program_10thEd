package SalesCommission;

import javax.swing.*;
import java.util.LinkedList;

public class Calculator {
    private int accountNumber;
    private LinkedList<Double> items = new LinkedList<>();

    public Calculator(int accountNumber){
        // validate that account number is positive
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        }
    }

    public double getItemSum() {
        double sum = 0;

        for (double num : this.items){
            sum += num;
        }

        return (sum);
    }

    public double calculateEarnings() {
        return (200 + 0.09*this.getItemSum());
    }

    public void displayEarnings(){
        JOptionPane.showMessageDialog(null, String.format(
                "The earnings are: %,.2f", this.calculateEarnings()));
    }

    public void addItem(double value) {
        items.add(value);
        System.out.printf("Value %,.2f was added", value);
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

}
