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

    public void showDetails() {
        System.out.println("Account Holder=" + accountHolder + ", Balance=" + balance);
    }
}

public class AccountHolder {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Aryan", 10000);
        acc1.showDetails();
    }
}
