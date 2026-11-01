package Exception;

public class TestArithmeticException {
	
	public static void main(String[] args) {
		
		int i = 10;
		
		try {
			System.out.println(i/0);
			
		} catch (Exception e) {
			System.out.println(e + " = 0 se divide karne ka valid mathematical result nahi hota, isliye exception aati hai");
		
		}finally {
			System.out.println("There is exception or not i will run anyway");
		}
	}

}
