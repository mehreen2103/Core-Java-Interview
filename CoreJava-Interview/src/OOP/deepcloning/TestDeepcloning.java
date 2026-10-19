package OOP.deepcloning;

public class TestDeepcloning {
	
	public static void main(String[] args) throws CloneNotSupportedException  {

		Customer c = new Customer("Mehreen");
		Customer c1 = (Customer)c.clone();
		c1.name = "Ansari";
		c1.no.balance = 200;

		System.out.println(c.name);
		System.out.println(c.no.balance);

		System.out.println(c1.name);
		System.out.println(c1.no.balance);

	}
}
