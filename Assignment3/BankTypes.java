// Superclass
class BankAccount {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println(accountHolder + " → Balance=" + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println(accountHolder + " → Balance=" + balance + ", Interest=" + interest);
    }
}

// Subclass: CurrentAccount
class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void checkOverdraft() {
        System.out.println(accountHolder + " → Balance=" + balance + ", Overdraft Limit=" + overdraftLimit);
    }
}

// Main class
public class BankTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Ramesh", 5000, 5);
        sa.calculateInterest();

        CurrentAccount ca = new CurrentAccount(102, "Anita", 2000, 1000);
        ca.checkOverdraft();
    }
}
