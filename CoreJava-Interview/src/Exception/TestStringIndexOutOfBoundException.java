package Exception;

public class TestStringIndexOutOfBoundException {
	
	public static void main(String[] args) {
		
		String s = "abc";
		
		try {
			System.out.println(s.charAt(3));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}
