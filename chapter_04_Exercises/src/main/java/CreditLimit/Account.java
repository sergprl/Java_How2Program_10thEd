package CreditLimit;
import javax.swing.*;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private int originalBalance = 0;
    private int credits = 0;
    private int charges = 0;
    private int limit;

    public Account(int accountNumber, int limit) {
        // account number should be positive
        if (accountNumber > 0)
            this.accountNumber = accountNumber;

        // limit should be positive and greater than 50
        if (limit >= 50)
            this.limit = limit;
    }

    public void setLimit(int limit) {
        Scanner input = new Scanner(System.in);

        if (limit >= 50) {
            System.out.printf("Limit will be set to %d.%nProceed? (y/n): ", limit);
            if (input.next().equalsIgnoreCase("n"))
            {
                JOptionPane.showMessageDialog(null, "Limit was not updated");
            } else {
                this.limit = limit;
                JOptionPane.showMessageDialog(null,
                        String.format("Limit updated to %d", this.limit));
            }

        }
    }

    public int getLimit(){
        return this.limit;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public int getOriginalBalance() {
        return this.originalBalance;
    }

    public int getCharges() {
        return this.charges;
    }

    public int getCredits() {
        return this.credits;
    }

    private void setCredits(int credits){
        if (credits >= 0) {
            this.credits = credits;
        }
    }

    private void setCharges(int charges) {
        if (charges >= 0) {
            this.charges = charges;
        }
    }

    private void setOriginalBalance (int balance) {
        if (balance >= 0) {
            this.originalBalance = balance;
        }
    }

    public void updateBalance() {
        // update balance
        this.setOriginalBalance(this.getOriginalBalance() + this.getCharges() - this.getCredits());

        // update charges and credits
        this.setCharges(0);
        this.setCredits(0);
    }

    public void addCredit(int credit) {
        // check that credit is positive
        if (credit > 0) {
            this.credits += credit;
        }

        // inform the user
        System.out.printf("New credit is: %,.2f%n", (float)this.getCredits());
    }

    public void addCharge(int charge){
        // check that charge is positive
        if (charge > 0) {
            if ((this.getOriginalBalance() + charge) > limit)
            {
                JOptionPane.showMessageDialog(null, "Not enough credit!");
                System.out.printf("Tried to charge $%d, but limit of %d exceeded%n", charge, this.getLimit());
                this.displayInfo();
            } else {
                this.charges += charge;
            }

        }

        // inform the user
        System.out.printf("New charges are: %,.2f%n", (float)this.getCharges());
    }

    public void displayInfo() {
        JOptionPane.showMessageDialog(null, String.format("ACCOUNT INFORMATION%n" +
                "Balance: %,.2f%n" +
                "Charges: %,.2f%n" +
                "Credit: %,.2f%n%n" +
                "Limit: %,.2f%n" +
                "Please, update the balance at the end of the month!",
                (float)this.getOriginalBalance(),(float)this.getCharges(), (float)this.getCredits(),
                (float)this.getLimit()));
    }

}
