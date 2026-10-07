package JavaBasics;

public class OddEvenNo {
	
	public static void main(String[] args) {
		
		int i = 13;
		
		if (i % 2 == 0) {
			
			System.out.println(i + " this is even nNumber");
			
		}else {
			
			System.out.println((i + "this is not even number"));
		}
		
		for (int i2 = 2 ; i2 <= 100; i2++) {
			
			if (i2 % 2 ==0) {
				
				System.out.println(i2 + "this is Even Number");
				
			}else {
				
				System.out.println(i2 + "this is odd number");
			}
		}
	}

}
