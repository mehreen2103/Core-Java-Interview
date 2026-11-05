package Exception;

public class SystemExit {
	
	public static void main(String[] args) {
		
		String s = null;
		
		try {
			System.out.println(s.length());
			
		} catch (Exception e) {
			
			System.out.println("catch");
			e.printStackTrace();
			System.exit(0); // <----this line will terminate code
			
		}finally {
			System.out.println("finally");
		}
	}

}

//System.exit(int status) JVM ko completely shutdown kar deta hai.
//- System.exit(0) → Normal termination.
//- System.exit(1) (ya koi non-zero value) → Abnormal termination.
//Dono cases me JVM band ho jati hai, isliye finally block execute nahi hota.
