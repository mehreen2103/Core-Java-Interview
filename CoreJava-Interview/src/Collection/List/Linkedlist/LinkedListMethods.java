package Collection.List.Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		list.add("Mehreen");
		list.add("Noshi");
		list.add("Inaya");
		list.add("bilal");
		list.add("fatimah");

		System.out.println("list: " + list);

		Iterator it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("index of :  " + list.indexOf("Mehreen"));
		System.out.println("get: " + list.get(4));
		System.out.println("set: " +list.set(1, "Ansari"));
		System.out.println("getfirst: " + list.getFirst());
		System.out.println("getlast: " +list.getLast());
		System.out.println("list: " + list);
	}

}