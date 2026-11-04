package Exception.trycatch;

public class TryWithMultyCatch {

	public static void main(String[] args) {
		
		
		int a = 10;
		String s = "abc";
		
		try {
			int c  = a / 0;
			
			System.out.println(s.length());
			System.out.println("Division = " + c);
			
		} catch (NullPointerException e) {
			
			System.out.println(e);
			System.out.println(e.getMessage());
			
		}catch (StringIndexOutOfBoundsException e) {
			
			System.out.println(e);
			
		}finally {
			System.out.println("Finally");
		}
	}
}
