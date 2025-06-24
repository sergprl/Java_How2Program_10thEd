package CreditLimit;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Account account = new Account(1, 50);
        account.displayInfo();

        account.addCharge(50);
        account.addCredit(10);
        account.displayInfo();

        account.addCharge(100);
        account.addCredit(40);
        account.displayInfo();

        account.setLimit(200);
        account.addCharge(100);
        account.addCredit(40);
        account.displayInfo();

        account.updateBalance();
        account.displayInfo();


    }

}
