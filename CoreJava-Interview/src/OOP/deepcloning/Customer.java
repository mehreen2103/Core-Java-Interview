package OOP.deepcloning;

/**
 * @author mehre
 * 
 * Example of deep cloning
 *
 */
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
		c.account = (Account)account.clone();   //deep cloning
		return c;
	}

}
