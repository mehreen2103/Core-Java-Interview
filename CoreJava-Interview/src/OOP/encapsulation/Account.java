package OOP.encapsulation;

public class Account {
	
	public double balance = 0;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Balance after deposit = " + balance);
	}
	
	public void withdrawl(double amount) {
		
		if (balance < amount) {
			
			System.out.println("Insufficient found");
		}else {
			
			balance = balance - amount;
			System.out.println("Balance after withdrawl = " + balance);
		}
	}

}
