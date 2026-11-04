package Exception;

public class ExceptionHierarchy {
	
	public static void main(String[] args) {
		
		String name = "Mehreen";
		
		try {
			System.out.println(name.charAt(10));
			
		} catch (StringIndexOutOfBoundsException e) {
			
			System.out.println("Index out of bound");
			
		}catch (Exception e) {
			
			System.out.println("Exception...............");
			
		}finally {
			
			System.out.println("I am Always execute ");
		}
	}

}
