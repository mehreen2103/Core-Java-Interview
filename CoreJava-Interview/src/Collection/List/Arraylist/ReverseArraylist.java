package Collection.List.Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add("21");
		l.add("03");
		l.add("11");
		
		System.out.println(l);
		
		Collections.reverse(l);
		
		System.out.println(l);
	}

}
