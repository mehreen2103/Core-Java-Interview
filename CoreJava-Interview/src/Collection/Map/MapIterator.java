package Collection.Map;

import java.util.HashMap;

public class MapIterator {
	
	public static void main(String[] args) {
		
		HashMap m = new HashMap();

		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4000, "fourh");
		m.put(4, null);
		m.put(4, "mnull");
		
		for (Object o : m.entrySet()) {

			System.out.println(o);

		}
		System.out.println("-----------------------");
		// System.out.println(m);

		for (Object o : m.values()) {

			System.out.println(o);

			// System.out.println(m);
		}
		
		System.out.println("-----------------------");
		for (Object o : m.keySet()) {

			System.out.println(o);
		}

	}


}
