package Exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NoSuchElement {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Mehreen");
		list.add("Noshi");
		
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		try {
			System.out.println(it.next());
			
		} catch (NoSuchElementException e) {
			
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
