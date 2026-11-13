package Collection.Queue.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueMethods {
	
	public static void main(String[] args) {
		
		Deque q = new ArrayDeque();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println(q);
		System.out.println("OfferFirst: " + q.offerFirst(10));
		System.out.println(q);
		System.out.println("OfferLast: " + q.offerLast(50));
		System.out.println(q);
		System.out.println("Poll First: " + q.pollFirst());
		System.out.println(q);
	}

}
//offerFirst() → Queue ke starting me element add karta hai.
//offerLast() → Queue ke end me element add karta hai.
//pollFirst() → Queue ka pehla element remove karke return karta hai.