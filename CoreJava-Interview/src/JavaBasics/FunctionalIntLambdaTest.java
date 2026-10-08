package JavaBasics;

public class FunctionalIntLambdaTest {
	
	public static void main(String[] args) {
		
		FunctinalInt f = (a, b) -> {
			
			return a + b;
		};
		int a = 30;
		int b = 30;

		System.out.println(f.sum(a, b));
	}


}
