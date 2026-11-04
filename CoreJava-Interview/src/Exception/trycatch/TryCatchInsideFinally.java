package Exception.trycatch;

public class TryCatchInsideFinally {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("try");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch");
			
		}finally {
			
			try {
				System.out.println("Inside finally try");
				
				int a = 10 / 0;
				
			} catch (ArithmeticException e) {
				
				e.printStackTrace();
				
				System.out.println("Inside finally catch");
			}
			
			System.out.println("Finally End");
		}
	}

}
