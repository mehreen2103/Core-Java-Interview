package Exception;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Balance after deposit: " + balance);
	}

	public void withdrawl(double amount) throws InsufficientBalance {
		
		if (balance < amount) {
			throw new InsufficientBalance();
			
		} else {
			balance = balance - amount;
			System.out.println("Balance After Withdrawl= " + balance);
		}
	}

}
