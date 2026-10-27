package OOP.methodreturn;

public class TestUser {
	
	public static void main(String[] args) {
		
		User u1 = User.getUser(1);
		u1.dashboard();
		
		User u2 = User.getUser(2);
		u2.dashboard();
		
		User u3 = User.getUser(3);
		u3.dashboard();
	}

}
