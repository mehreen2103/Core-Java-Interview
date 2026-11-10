package Collection.List.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylistest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("4");
		list.add("4");

		// add index at 2
		list.add(2, "3");
		System.out.println(list);

		// get value(index 3 ki value orint hogi
		System.out.println(list.get(3));

		List<String> list2 = new ArrayList<String>();
		list2.add("5");
		list2.add("6");

		System.out.println(list2);

		System.out.println(list.subList(1, 2)); // return part of value

		System.out.println(list.contains("3"));// available(check karega "3" present hai ya nhi)
		System.out.println(list.addAll(list2)); // add all but return true(list2 ke saare elements list me add ho jayenge.)
		System.out.println(list); // add

//		Check karega list me list2 ke saare elements hain ya nahi.
		System.out.println(list.containsAll(list2)); // sare element availble h list2 m
		System.out.println(list); // add

// remove 
		System.out.println(list); // add

		list.clear();
		System.out.println(list);
		System.out.println(list2);

		Object[] nums = list2.toArray();

		System.out.println(nums); // [Ljava.lang.Object;@2d363fb3

		System.out.println(Arrays.toString(nums)); // [5, 6]
		list2.set(1, "5");
		System.out.println(list2);
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("5");

		System.out.println(list);

		/*
		 * list.removeAll(list2); // Matching elements remove System.out.println(list2);
		 * System.out.println(list);
		 */

		System.out.println(list.size());
		System.out.println(list.isEmpty());

		System.out.println(list.indexOf("2"));// First occurrence ka index
		System.out.println(list.lastIndexOf("5")); // last nhi mila -1

		System.out.println(list.retainAll(list2));

		System.out.println(list); // retainAll() ka use common elements ko rakhne ke liye hota hai

	}
}
