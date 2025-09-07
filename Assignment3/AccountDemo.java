// Superclass
class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
}

// Subclass SavingAccount
class SavingAccount extends Account {
    double interestRate;

    SavingAccount(int accountNo, double balance, double interestRate) {
        super(accountNo, balance);
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Saving → " + accountNo + ", Balance=" + balance + ", Interest=" + interestRate + "%");
    }
}

// Subclass CurrentAccount
class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int accountNo, double balance, double overdraftLimit) {
        super(accountNo, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void display() {
        System.out.println("Current → " + accountNo + ", Balance=" + balance + ", Overdraft=" + overdraftLimit);
    }
}

// Main class
public class AccountDemo {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(101, 5000, 5);
        CurrentAccount c = new CurrentAccount(102, 10000, 2000);

        s.display();
        c.display();
    }
}
