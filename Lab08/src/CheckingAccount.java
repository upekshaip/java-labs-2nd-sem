package src;

public class CheckingAccount extends BankAccount {
    private static float checkingInterest = 2 / 100;

    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public double calculateInterest() {
        return this.getBalance() * checkingInterest;
    }

    public float getCheckingInterest() {
        return checkingInterest;
    }

    public void setCheckingInterest(float checkingInterest) {
        this.checkingInterest = checkingInterest;
    }
}
