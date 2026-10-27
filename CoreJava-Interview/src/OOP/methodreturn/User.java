package OOP.methodreturn;

public class User {
	
	public void dashboard() {
		
		System.out.println("Welcome User");
	}
	
	public static User getUser(int role) {
		
		if (role == 1) {
			return new Admin();
		}
		if (role == 2) {
			return new Student();
		}
		return new User();
	}

}
