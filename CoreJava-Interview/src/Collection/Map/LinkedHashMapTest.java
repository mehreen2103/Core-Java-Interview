package Collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

		// Add Elements
		map.put(1, "KGN");
		map.put(2, "JTN");
		map.put(3, "Indore");
		map.put(4, "Bhopal");
		map.put(5, "Ujjain");

		System.out.println("LinkedHashMap = " + map);

		// Methods

		System.out.println("Get Key 2 = " + map.get(2));

		System.out.println("Contains Key 3 = " + map.containsKey(3));

		System.out.println("Contains Value KGN = " + map.containsValue("KGN"));

		System.out.println("Keys = " + map.keySet());

		System.out.println("Values = " + map.values());

		System.out.println("Entries = " + map.entrySet());

	}

}
