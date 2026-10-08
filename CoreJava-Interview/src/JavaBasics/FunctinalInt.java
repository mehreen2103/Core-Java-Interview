package JavaBasics;

@FunctionalInterface
public interface FunctinalInt {

	public int sum( int a ,int b);
	
	public static void sub(int a, int b) {
		System.out.println(a - b);
	}
	
	default void multi(int a, int b) {
		System.out.println(a * b);
	}
}
