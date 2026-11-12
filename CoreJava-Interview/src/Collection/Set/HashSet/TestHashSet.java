package Collection.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {

		HashSet<String> s = new HashSet<String>();
		
		s.add("34");
		s.add("67");
		s.add(null);
		s.add(null);
		
		Iterator<String> it = s.iterator();
		
		while (it.hasNext()) {
			
			String s1 = it.next();
			System.out.println(s1);

		}
	}

}
