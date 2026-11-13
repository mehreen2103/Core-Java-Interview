package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {
	
	public static void main(String[] args) {
		
		Queue<String> q = new LinkedList<>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		
		System.out.println(q);
		System.out.println("Peek: " + q.peek());
		System.out.println("Poll: " + q.poll());
		System.out.println(q);
		System.out.println("Remove: " + q.remove() );
		System.out.println(q);
		System.out.println("Element: " + q.element());
	}

}
//peek() → Queue ka pehla element dekhta hai, lekin remove nahi karta.
//poll() → Queue ka pehla element return karke remove kar deta hai.
//remove() → Queue ka pehla element remove karta hai, aur agar queue empty ho to Exception deta hai.
//element() → Queue ka pehla element return karta hai, lekin remove nahi karta; agar queue empty ho to Exception deta hai.