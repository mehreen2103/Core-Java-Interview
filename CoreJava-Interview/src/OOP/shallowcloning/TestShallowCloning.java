package OOP.shallowcloning;

public class TestShallowCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {

		Shallowcloning s = new Shallowcloning();
		s.balance = 100;

		Shallowcloning s2 = (Shallowcloning)s.clone() ;
		s2.balance = 200;
		System.out.println(s.balance);
		System.out.println(s2.balance);
	}


}
