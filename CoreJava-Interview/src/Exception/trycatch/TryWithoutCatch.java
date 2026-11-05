package Exception.trycatch;

public class TryWithoutCatch {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Hello");
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Finally");
		}
	}

}
