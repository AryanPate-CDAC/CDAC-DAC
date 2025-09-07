class BankAccount {
	private double balance;
	void deposit(double amount){
		balance += amount;
		System.out.println(amount+ " Deposited!..");
	}
	
	void withdraw(double amount){
		if(amount <= balance){
			balance -= amount;
			System.out.println(amount+ " Withdraw!..");
		}
		else{
			System.out.println("Amount exceeded");
		}
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
}

public class AccountCheck {
	public static void main(String args[]){
		BankAccount b = new BankAccount();
		b.deposit(3000.00);
		b.getBalance();
		b.withdraw(1000.00);
		b.getBalance();
	}
}
		