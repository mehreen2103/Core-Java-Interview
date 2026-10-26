package OOP.shallowcloning;

public class TestAccount {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account a = new Account();
        a.balance = 100;

        Customer c1 = new Customer();
        c1.name = "Mehreen";
        c1.account = a;

        Customer c2 = (Customer) c1.clone();

        c2.name = "Riya";
        c2.account.balance = 200;

        System.out.println("Customer 1 Name = " + c1.name);
        System.out.println("Customer 1 Balance = " + c1.account.balance);

        System.out.println();

        System.out.println("Customer 2 Name = " + c2.name);
        System.out.println("Customer 2 Balance = " + c2.account.balance);
    }
}