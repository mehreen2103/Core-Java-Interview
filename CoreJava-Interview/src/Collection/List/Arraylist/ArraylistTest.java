package Collection.List.Arraylist;

import java.util.ArrayList;

public class ArraylistTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		// 1. add()
		list.add("1");
		list.add("2");
		list.add("4");
		list.add("4");

		System.out.println("After add() : " + list);

		// 2. add(index, element)
		list.add(2, "3");
		System.out.println("After add(index, element) : " + list);

		// 3. get()
		System.out.println("get(3) : " + list.get(3));

		// 4. set()
		list.set(1, "10");
		System.out.println("After set() : " + list);

		// 5. remove()
		list.remove(2);
		System.out.println("After remove() : " + list);

		// 6. size()
		System.out.println("Size : " + list.size());

		// 7. isEmpty()
		System.out.println("isEmpty : " + list.isEmpty());

		// 8. clear()
		list.clear();
		System.out.println("After clear() : " + list);

	}
}