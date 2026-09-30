package String;

public class CountOccuranceOfString {
	
	public static void main(String[] args) {
		
		String s = " mehreen ansari";
		
		for (char c = 'a' ; c <= 'z'; c++) {
			
			int count = 0;
			
			for (int i = 0; i < s.length(); i++) {
				
				if (s.charAt(i) == c) {	
					count ++;
				}
			}
			
			if (count > 0) {
				System.out.println(c + " " + count);
			}
		}
	}

}
