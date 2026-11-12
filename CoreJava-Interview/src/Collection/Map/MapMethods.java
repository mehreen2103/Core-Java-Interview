package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		// put()
		map.put(101, "Mehreen");
		map.put(102, "Noshi");
		map.put(103, "Inaya");
		map.put(104, "Rauzah");
		map.put(105, "Fatimah");

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
		System.out.println("Contains Value Raj = " + map.containsValue("Raj"));

		// keySet()
		System.out.println("Keys = " + map.keySet());

		// values()
		System.out.println("Values = " + map.values());

		// entrySet()
		System.out.println("Entries = " + map.entrySet());

		// replace()
		map.replace(105, "Anaya");
		System.out.println("After Replace = " + map);

		// remove()
		map.remove(104);
		System.out.println("After Remove = " + map);

		// putIfAbsent()
		map.putIfAbsent(106, "Ankit");
		System.out.println("After putIfAbsent = " + map);

		// remove(key, value)
		map.remove(102, "Noshi");
		System.out.println("After remove(key,value) = " + map);

		// clear()
		map.clear();
		System.out.println("After Clear = " + map);

		// isEmpty()
		System.out.println("Is Empty = " + map.isEmpty());

	}}
