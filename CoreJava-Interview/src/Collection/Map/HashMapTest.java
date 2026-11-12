package Collection.Map;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		// Add Elements
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");

		System.out.println("HashMap = " + map);

		// Methods
		System.out.println("Size = " + map.size());
		System.out.println("Is Empty = " + map.isEmpty());
		System.out.println("Get Key 5 = " + map.get(5));
		System.out.println("Contains Key 4 = " + map.containsKey(4));
		System.out.println("Contains Value D = " + map.containsValue("D"));

//		// Print Keys
//		System.out.println("Keys = " + map.keySet());
//
//		// Print Values
//		System.out.println("Values = " + map.values());
//
//		// Print Entries
//		System.out.println("Entries = " + map.entrySet());

	}
}
