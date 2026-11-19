package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
	
	public static void main(String[] args) {
		
		Queue<String > q = new LinkedList();
		
		q.add("A");
		q.add("B");
		q.add("C");
		
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q.offer("D"));
		System.out.println(q);
	}

}
