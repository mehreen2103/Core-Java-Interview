package Collection.Map;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>();

		// Add Elements
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");

		System.out.println("TreeMap = " + map);

		// Methods
		System.out.println("First Key = " + map.firstKey());
		System.out.println("Last Key = " + map.lastKey());

		System.out.println("First Entry = " + map.firstEntry());
		System.out.println("Last Entry = " + map.lastEntry());

		System.out.println("Get Key 3 = " + map.get(3));

		System.out.println("Keys = " + map.keySet());

	}

}
