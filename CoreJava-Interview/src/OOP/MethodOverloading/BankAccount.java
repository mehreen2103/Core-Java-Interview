package OOP.MethodOverloading;

public class BankAccount {
	
//	deposit by amount
	public void deposit(double amount) {
		System.out.println("Amount Deposited : " + amount);
	}

//	deposit by amount and accountnumber
	public void deposit(double amount, String accountNumber) {
		System.out.println("Amount : " + amount);
		System.out.println("Account Number: " + accountNumber);
		
	}
	
//	depost by amount, accountnumber & branchname
	public void deposit(double amount, String accountNumber, String branchName) {
		System.out.println("Amount : " + amount);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Branch: " + branchName );
		
	}
}
