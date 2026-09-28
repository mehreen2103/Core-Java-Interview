package String;

public class StringBufferMethods {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("java");

		System.out.println("length :" + sb.length());

		System.out.println("delete :" + sb.delete(0, 2));

		System.out.println("string :" + sb.toString());

		System.out.println("insert : " + sb.insert(2, "s"));

		System.out.println("Capacity : " + sb.capacity());

		System.out.println("IndexOf:" + sb.indexOf("r"));

		System.out.println("CharAt:" + sb.charAt(1));

		System.out.println("Replace:" + sb.replace(0, 2, "n"));

		System.out.println("Append:" + sb.append(" Ansari"));

		System.out.println("Reverse = " + sb.reverse());
		
	}

}
