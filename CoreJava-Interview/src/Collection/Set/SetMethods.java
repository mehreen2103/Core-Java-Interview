package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethods {
	
	public static void main(String[] args) {

		Set s = new HashSet();

		s.add(1);
		s.add(2);
		s.add(null);
		s.add(null);
		s.add(null);
		s.add(1);

		System.out.println(s);

		HashSet hs = new HashSet();

		hs.add("zero");
		hs.add("two");
		hs.add("four");
		hs.add("six");
		hs.add(null);
		hs.add(null);

		Iterator it = hs.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}


}

