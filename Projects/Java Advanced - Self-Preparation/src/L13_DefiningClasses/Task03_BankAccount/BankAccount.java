package L13_DefiningClasses.Task03_BankAccount;

public class BankAccount {
    private static double interestRate = 0.02;

    private static int accountsCounter = 1;
    private int id = 1;
    private double balance = 0.0;

    public BankAccount() {
        this.id = accountsCounter;
        accountsCounter++;
        this.balance = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate(int years) {
        return years * interestRate * this.balance;
    }

    public static void setInterestRate(double interest) {
        BankAccount.interestRate = interest;
    }

    public void deposit(double money) {
        this.balance += money;

    }
}
