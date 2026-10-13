package JavaBasics.Pattern;


/**
 * @author mehre
 * 
 * tRiangle Program
 *
 */
public class Triangle {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
