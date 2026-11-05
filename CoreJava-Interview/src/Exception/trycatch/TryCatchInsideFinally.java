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
//finally block ke andar bhi try-catch likh sakte hain.
//Agar finally ke andar exception aaye aur usko wahi handle kar diya jaye, to program normally continue karta hai.
//Agar finally ke andar exception handle na ho, to program terminate ho sakta hai.
