package String;

public class CountOccuranceOfStringArray {
	
	public static void main(String[] args) {
		
		String[] str = {"core", "java"};
		
		for (char c = 'a'; c <='z'; c++) {
			
			for (String n : str) {
				
				int count = 0;
				
				for (int i = 0; i < n.length(); i++) {
					
					if (c == n.charAt(i)) {
						count++;
					}
				}
				if (count > 0) {
					System.out.println(c + " " + count);
				}
			}
		}
	}

}
