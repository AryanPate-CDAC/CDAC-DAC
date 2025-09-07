class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance for " + accountHolder);
        }
    }

    public void showDetails() {
        System.out.println("Account Holder=" + accountHolder + ", Balance=" + balance);
    }
}

public class DepositWithdrawal {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Aryan", 10000);
        BankAccount acc2 = new BankAccount("Priya", 15000);

        acc1.deposit(2000);
        acc1.withdraw(5000);

        acc2.deposit(3000);
        acc2.withdraw(20000);

        acc1.showDetails();
        acc2.showDetails();
    }
}
