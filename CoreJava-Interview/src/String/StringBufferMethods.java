package String;
public class StringBufferMethods {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("mehreen");

		System.out.println("length :" + sb.length());//
		
		System.out.println("Append:" + sb.append(" Ansari"));  

		System.out.println("insert : " + sb.insert(0, "abc   "));
 
		System.out.println("delete :" + sb.delete(0, 3));

//		System.out.println("string :" + sb.toString());

		System.out.println("Capacity : " + sb.capacity());

//		System.out.println("IndexOf:" + sb.indexOf("r"));//

//		System.out.println("CharAt:" + sb.charAt(1));//
		
		System.out.println("Reverse = " + sb.reverse());///
		
	}
}