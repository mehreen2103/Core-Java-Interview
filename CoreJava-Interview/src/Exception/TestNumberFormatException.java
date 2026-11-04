package Exception;

public class TestNumberFormatException {
	
	public static void main(String[] args) {

		String str = "Mehreen12345";

		try {
			System.out.println(Integer.parseInt(str));
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
