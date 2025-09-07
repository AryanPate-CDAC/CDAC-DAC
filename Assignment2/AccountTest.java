class BankAccount {
    private String name;
    private double balance;
    private static double interestRate;

    static {
        interestRate = 4.0;
        System.out.println("Bank Interest Rate Initialized: " + interestRate + "%");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public void showDetails() {
        System.out.println("Name=" + name + ", Balance=" + balance + ", Interest Rate=" + interestRate + "%");
    }
}

public class AccountTest {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.setName("Rohit");
        a1.setBalance(5000);

        BankAccount a2 = new BankAccount();
        a2.setName("Priya");
        a2.setBalance(15000);

        System.out.print("Account1: "); a1.showDetails();
        System.out.print("Account2: "); a2.showDetails();
    }
}
