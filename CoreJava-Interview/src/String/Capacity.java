package String;

public class Capacity {
	public static void main(String[] args) {
		
			StringBuffer sb = new StringBuffer("Mehreen Ansari");
//			
//			System.out.println("length: " + sb.length());
//			System.out.println("Capacity: " +sb.capacity());
//			
//			System.out.println("------------------------------------");
			System.out.println(sb.append("abcdefghijklmnopqrstuvwxyz"));
			System.out.println("Length: " + sb.length());
			System.out.println("Capacity: " + sb.capacity());
			
			System.out.println("------------------------------------");
			System.out.println(sb.append("egf"));
			System.out.println("Length: " + sb.length());
			System.out.println("Capacity: " + sb.capacity());
	}

}
