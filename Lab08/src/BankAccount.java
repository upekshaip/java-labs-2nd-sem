package src;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void calculateInterests(double savingsBalance, double checkingBalance) {
        var savings = new SavingsAccount(accountNumber, savingsBalance);
        var checking = new CheckingAccount(accountNumber, checkingBalance);

        System.out.println(savings.calculateInterest());
        System.out.println(checking.calculateInterest());

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
