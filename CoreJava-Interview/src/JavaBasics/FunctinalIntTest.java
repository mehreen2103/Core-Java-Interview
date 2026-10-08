package JavaBasics;

public class FunctinalIntTest {

	public static void main(String[] args) {
		
		FunctinalInt f = new FunctinalInt() {
			
			@Override
			public int sum(int a, int b) {
				
				return a + b;
			}
		};
		
		int a = 20;
		int b = 10;
		
		System.out.println(f.sum(a, b));
		FunctinalInt.sub(a, b);
		f.multi(a, b);
		
	}
}
