package src;

public class SavingsAccount extends BankAccount {
    private static float savingsInterest = 12 / 100;

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double calculateInterest() {
        return getBalance() * savingsInterest;
    }

    public float getSavingsInterest() {
        return savingsInterest;
    }

    public void setSavingsInterest(float savingsInterest) {
        this.savingsInterest = savingsInterest;
    }
}
