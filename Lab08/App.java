
import src.BankAccount;
import src.CheckingAccount;
import src.SavingsAccount;

public class App {
    public static void main(String[] args) {
        var ba = new BankAccount(2020, 88888);
        System.out.println(ba.getBalance());
        ba.calculateInterests(100000, 500000);

        var savings = new SavingsAccount(2020, 123456);
        var checking = new CheckingAccount(2020, 123456);

        System.out.println(savings.calculateInterest());
        System.out.println(checking.calculateInterest());
    }
}