package Exception;

/**
 * son() Exception throw karta hai → 
 * mom() handle nahi karti aur 
 * dad() ko bhej deti hai → 
 * dad() handle nahi karta aur main() ko bhej deta hai
 *  → main() bhi handle nahi karta aur JVM ko bhej deta hai. JVM exception ka stack trace print karke program terminate kar deti hai.
 *
 */
public class CheckedException {
	
	public static void main(String[] args) throws Exception {
		dad();
	}

	public static void dad() throws Exception {
		mom();
	}
	
	public static void mom() throws Exception {
		son();
	}
	
	public static void son() throws Exception {
	    throw new Exception();	
	}

}
