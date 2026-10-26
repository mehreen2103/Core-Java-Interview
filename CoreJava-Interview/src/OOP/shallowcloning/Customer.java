package OOP.shallowcloning;

public class Customer implements Cloneable{

	public String name;
	 public Account account;
	 
	 
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();   //Shallow cloning
	}
}
