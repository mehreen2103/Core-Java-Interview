package Exception;

public class TestNullPointerException {
	
	public static void main(String[] args) {
		
		String s = null;
		
		try {
			System.out.println(s.length());
			
		} catch (Exception e) {
			System.out.println("Object ki value null hai length nhi niklegi");
		}
		
	}

}
