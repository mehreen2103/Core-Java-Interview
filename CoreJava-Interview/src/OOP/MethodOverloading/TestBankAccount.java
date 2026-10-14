package OOP.MethodOverloading;

public class TestBankAccount {
	
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		
		b.deposit(5000);
		System.out.println("--------------------------");
		b.deposit(5000, "ACC1025576");
		System.out.println("--------------------------");
		b.deposit(5000, "ACC1025576", "IndoreBranch");
	}

}
