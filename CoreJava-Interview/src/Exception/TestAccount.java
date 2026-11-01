package Exception;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(1000000);
		a.deposit(50);
		
		try {
			a.withdrawl(100060);
			
		} catch (InsufficientBalance e) {
			System.out.println(e);
		}
	}

}
