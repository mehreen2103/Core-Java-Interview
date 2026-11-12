package Collection;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethods {
	
	public static void main(String[] args) {
		Collection c = new ArrayList();

		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);

		System.out.println(c);
		System.out.println("add: " +c.add(50));
		System.out.println("addAll: " + c.addAll(c));
		System.out.println(c);
		System.out.println("size: " + c.size());
		System.out.println("contains: " +c.contains(10));
		System.out.println( c);
		System.out.println("contains all: " + c.containsAll(c));
		System.out.println(c.isEmpty());
		System.out.println(c.remove(10));
		System.out.println(c);
		System.out.println("removeall: " +c.removeAll(c));
		
		c.clear();
		System.out.println(c);
	}

}
