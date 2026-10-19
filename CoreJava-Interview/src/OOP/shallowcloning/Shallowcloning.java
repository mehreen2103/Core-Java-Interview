package OOP.shallowcloning;

public class Shallowcloning implements Cloneable{
	
	public int balance;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
