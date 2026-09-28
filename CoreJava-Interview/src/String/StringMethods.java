package String;

public class StringMethods {

	public static void main(String[] args) {

		String name = "Mehreen";
		String str = "Ansari";

		System.out.println("String length: " + name.length());
		System.out.println(name.trim().length());
		System.out.println("String Uppercase: " + name.toUpperCase());
		System.out.println("String Lowercase: " + name.toLowerCase());
		System.out.println("String Starts With: " + name.startsWith("N"));
		System.out.println("String Ends With: " +name.endsWith("S"));
		System.out.println("String Character: " +name.charAt(3));
		System.out.println("String Index: " + name.indexOf("e"));
		System.out.println("String Last Index: " + name.lastIndexOf("e"));
		System.out.println("Substring: " + name.substring(1));
		System.out.println(name.trim());
		System.out.println("Concat: " + name.concat(str));
		System.out.println(str.concat(name));
		System.out.println("String replace: " + name.replace("Mehreen", "Noshiba"));

		String str1 = "hello java";

		String[] s = str1.split(" "); //split => space ke hisab se string ko tod deta h 

		for (String s1 : s) {
			System.out.println(s1);

		}

		System.out.println("..........................");

		String n1 = "java";
		String n2 = "java";

		String n3 = new String("java");
		String n4 = new String("java");

		boolean b = n1 == n2;
		System.out.println(b);

		boolean b1 = n1.equals(n2);
		System.out.println(b1);

		boolean b2 = n3 == n4;
		System.out.println(b2);

		boolean b3 = n3.equals(n4);
		System.out.println(b3);
		
		boolean b44 = n1.equals(n3);
		System.out.println(b44);

		StringBuffer sb = new StringBuffer("hello");
		StringBuffer sb1 = new StringBuffer("hello");

		boolean b4 = sb.equals(sb1);
		System.out.println(b4);

	}

}