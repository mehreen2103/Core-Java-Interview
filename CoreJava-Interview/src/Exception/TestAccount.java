package Exception;

public class TestAccount {
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(10000);
		a.deposit(50);
		
		try {
			a.withdrawl(10060);
			
		} catch (InsufficientBalance e) {
			
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
 