package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class FailSafe {

	public static void main(String[] args) {

		Vector v = new Vector();

		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);

		System.out.println(v);
		
		Enumeration e = v.elements();

		v.addElement(5);

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}

//hasMoreElements() check karta hai ki next element hai ya nahi.
//nextElement() next element return karta hai.
