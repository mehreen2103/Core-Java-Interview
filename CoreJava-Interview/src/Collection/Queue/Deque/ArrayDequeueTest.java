package Collection.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueTest {
	
	public static void main(String[] args) {
		
		Deque q = new ArrayDeque();
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		
		System.out.println(q);
		q.addFirst("E");
		q.addLast("F");
		System.out.println(q);
		System.out.println("Remove: " + q.remove());
		System.out.println("Element: " + q.element());
		System.out.println(q);
	}

}
