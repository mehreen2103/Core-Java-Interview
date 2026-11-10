package Collection.List.Linkedlist;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {

		LinkedList<String> s = new LinkedList<String>();

		s.add("Mehreen");
		s.add("Noshi");
		s.add("inaya");
		s.add("alizeh");

		System.out.println(s);

		s.addFirst("Alizeh");
		s.addLast("Bilal");

		System.out.println(s);
		System.out.println("------------------------");
		System.out.println(s.get(2));
		System.out.println(s.getFirst());
		System.out.println(s.getLast());
		System.out.println("-----------------------");
		System.out.println(s.poll()); // First element remove + return
		System.out.println("-----------------------");
		System.out.println(s);
		System.out.println("First element : " + s.peek()); // First element dekhta hai

		System.out.println("------------------------");
		s.offer("Java"); // offer() adds an element at the end of the LinkedList and returns true if the
							// element is successfully adde
		s.offer("Python");
		s.offer("C");
		s.offerFirst("C++"); // start mein add
		s.offerLast("Jenkins"); /// last m add
		System.out.println(s);

		/*
		 * list.removeFirst(); list.removeLast();
		 */
	}

}
