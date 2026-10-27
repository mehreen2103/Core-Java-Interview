package OOP.deepcloning;

public class Customer implements Cloneable{
	
	public String name;
	
	public Account account;
	
	public Customer(String name) {
		this.name = name;
		account = new Account(100);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Customer c = (Customer) super.clone();
		c.account = (Account)account;   //deep cloning
		return c;
	}

}
