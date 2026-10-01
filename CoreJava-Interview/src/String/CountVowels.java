package String;

public class CountVowels {
	
	public static void main(String[] args) {
		
		String s = "mehreen";
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count ++;
			}
		}
		if (count > 0) {
			System.out.println(count);
		}
	}

}
