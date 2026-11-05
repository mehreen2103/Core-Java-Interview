package Exception;

public class TestLoginException {
	
	public static void main(String[] args ) {
		
		String s = "mehr";
		
		try {
			if (s.equals("admin")) {
				System.out.println("This is vallid user");
				
			}else {
				throw new LoginException();
			}
			
		} catch (LoginException e) {
			 
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
