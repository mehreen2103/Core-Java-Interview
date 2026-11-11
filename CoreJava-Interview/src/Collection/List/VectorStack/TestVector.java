package Collection.List.VectorStack;

import java.util.Vector;

/**
 * vector methods 
 * add() → Element add karta hai.
 * get() → Element fetch karta hai. 
 * remove() → Element delete karta hai.
 * size() → Total count batata hai.
 *
 */
public class TestVector {

	public static void main(String[] args) {

		Vector v = new Vector();

		// Adding elements
		v.add("Java");
		v.add("Python");
		v.add("C");
		v.add("JavaScript");

		System.out.println("Vector: " + v);

		// Accessing element
		System.out.println("Element at index 1: " + v.get(1));

		// Removing element
		v.remove("C");

		System.out.println("After removing C: " + v);

		// Size
		System.out.println("Size: " + v.size());
	}
}
