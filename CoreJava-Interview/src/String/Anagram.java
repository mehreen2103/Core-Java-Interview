package String;

import java.util.Arrays;


/**
 * Anagram 
 * @author mehre
 *
 */
public class Anagram {
	
	public static void main(String[] args) {
		
		String s1 = "mehreen";
		String s2 = "neerhem";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if (Arrays.equals(c1, c2)) {
			
			System.out.println("This is Anagram");
			
		}else {
			
			System.out.println("This is not Anagram");
		}
	}

}
