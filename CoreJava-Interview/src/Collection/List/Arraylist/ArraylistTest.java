package Collection.List.Arraylist;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		// add()
		list.add("1");
		list.add("2");
		list.add("4");
		list.add("4");

		// add(index, element)
		list.add(2, "3");
		System.out.println("List : " + list);

		// get()
		System.out.println("get(3) : " + list.get(3));

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("5");
		list2.add("6");

		System.out.println("List2 : " + list2);

		// subList()
		System.out.println("subList : " + list.subList(1, 2));

		// contains()
		System.out.println("contains : " + list.contains("3"));

		// addAll()
		System.out.println("addAll : " + list.addAll(list2));
		System.out.println(list);

		// containsAll()
		System.out.println("containsAll : " + list.containsAll(list2));

		// toArray()
		Object[] nums = list.toArray();
		System.out.println(Arrays.toString(nums));

		// set()
		list.set(1, "10");
		System.out.println("After set : " + list);

		// remove(index)
		list.remove(2);
		System.out.println("After remove : " + list);

		// size()
		System.out.println("Size : " + list.size());

		// isEmpty()
		System.out.println("isEmpty : " + list.isEmpty());

		// indexOf()
		System.out.println("indexOf(5) : " + list.indexOf("5"));

		// lastIndexOf()
		System.out.println("lastIndexOf(4) : " + list.lastIndexOf("4"));

		// removeAll()
		list.removeAll(list2);
		System.out.println("After removeAll : " + list);

		// retainAll()
		list.add("5");
		list.add("6");
		list.add("7");

		System.out.println("Before retainAll : " + list);

		list.retainAll(list2);
		System.out.println("After retainAll : " + list);

		// clear()
		list.clear();
		System.out.println("After clear : " + list);

	}
}