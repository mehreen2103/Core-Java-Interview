package Collection.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTest {

	public static void main(String[] args) {

		SortedMap<Integer, String> m = new TreeMap<Integer, String>();

		m.put(1, "one");
		m.put(2, "two");
		m.put(3, "three");
		m.put(4, "four");

		System.out.println(m);
		System.out.println("last key:" + m.lastKey());
		System.out.println("first key:" + m.firstKey());
		System.out.println("tail map:" + m.tailMap(2));
		System.out.println("sub map:" + m.subMap(2, 4));
		System.out.println("entry set:" + m.entrySet());
		System.out.println("head map:" + m.headMap(3));

	}

}
//
//put() → Data insert karta hai.
//firstKey() → Sabse chhoti key return karta hai.
//lastKey() → Sabse badi key return karta hai.
//tailMap() → Di hui key se last tak ki entries return karta hai.
//subMap() → Do keys ke beech ki entries return karta hai.
//entrySet() → Sabhi key-value pairs return karta hai.
//headMap() → Di hui key se pehle ki entries return karta hai.