class BankAccount {
    private String accountHolder;
    private double balance;
    static String bankName = "CDAC Bank";

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public static void displayBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    public void showDetails() {
        System.out.println("Account Holder=" + accountHolder + ", Balance=" + balance);
    }
}

public class BankName {
    public static void main(String[] args) {
        BankAccount.displayBankName();
        BankAccount acc1 = new BankAccount("Aryan", 12000);
        acc1.showDetails();
    }
}
