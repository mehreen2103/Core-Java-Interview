package Exception.uncheckedexception;

public class TestClassNotFoundException {

	public static void main(String[] args) {
		
		try {
			Class.forName("Exception.TestAccounts");
			System.out.println("Class Mil Gyi");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Class Nahi Mili " + e);

		}
	}
}
//ClassNotFoundException tab aati hai jab Class.forName()
//runtime par kisi class ko load karna chahta hai,
//lekin wo class project ya classpath me nahi milti.