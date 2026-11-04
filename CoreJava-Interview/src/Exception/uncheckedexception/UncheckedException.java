package Exception.uncheckedexception;
/**
 * Kyuki RuntimeException ek Unchecked Exception hai, 
 * isliye methods me throws likhna zaruri nahi hota.
 *
 */
public class UncheckedException {
	
	public static void main(String[] args) {
		dad();
	}
	
	public static void dad() {
		mom();
	}
	
	public static void mom() {
		son();
	}
	
	public static void son() {
		throw new RuntimeException();
	}

}
//son() RuntimeException throw karta hai → mom(), dad(), aur main() 
//ise handle nahi karte → Exception JVM tak propagate hoti hai aur
//JVM stack trace print karke program terminate kar deti hai.