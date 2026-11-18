package Collection.Map;
import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		// put()
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "C");
		map.put(104, "D");
		map.put(105, "E");

		System.out.println("Map = " + map);

		// size()
		System.out.println("Size = " + map.size());

		// isEmpty()
		System.out.println("Is Empty = " + map.isEmpty());

		// get()
		System.out.println("Get 103 = " + map.get(103));

		// containsKey()
		System.out.println("Contains Key 102 = " + map.containsKey(102));

		// containsValue()
		System.out.println("Contains Value A = " + map.containsValue("A"));

		// keySet()
		System.out.println("Keys = " + map.keySet());

		// values()
		System.out.println("Values = " + map.values());

		// entrySet()
		System.out.println("Entries = " + map.entrySet());

		// remove()
		map.remove(104);
		System.out.println("After Remove = " + map);

		// clear()
		map.clear();
		System.out.println("After Clear = " + map);

		// isEmpty()
		System.out.println("Is Empty = " + map.isEmpty());

	}
}
