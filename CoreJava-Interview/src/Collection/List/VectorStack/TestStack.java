package Collection.List.VectorStack;

import java.util.Stack;

/**
 * push()→ Stack me add karta hai.
 * pop() → Stack se remove + return karta hai.
 * peek()→ Stack ko sirf dekhta hai, remove nahi karta.
 *
 */
public class TestStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.push(10);
		s.push(20);
		s.push(null);
		s.push(30);
		s.push(40);

		System.out.println(s);
		System.out.println("================================");
		System.out.println(s.push(50));
		System.out.println("================================");
		System.out.println(s);
		System.out.println("================================");
		System.out.println(s.pop()); // top element ko remove karke return karta hai.
		System.out.println("================================");
		System.out.println(s.peek()); // top element ko sirf dekhta hai, remove nahi karta.
	}

}
