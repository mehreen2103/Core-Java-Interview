package String;

public class CountNoOfIntegerInString {
	
	public static void main(String[] args) {
		
		String n ="Mehree1121";
		
		int count = 0;
		
		for (int i = 0; i < n.length(); i++) {
			
			if (Character.isDigit(n.charAt(i))) {
				
				count++;
			}
		}
		if (count > 0) {
			System.out.println(count);
		}
	}

}