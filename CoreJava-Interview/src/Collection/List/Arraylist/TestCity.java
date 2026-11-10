package Collection.List.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestCity {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Indore");
		list.add("Hyedrabad");
		list.add("Bangalore");

//		Print all element

		/*
		 * Iterator it=list.iterator();
		 * 
		 * while(it.hasNext()) { String str= (String) it.next();
		 * 
		 * System.out.println(str);
		 */

//		sort list
		Collections.sort(list);

		for (Object o : list) {
			String s = (String) o;
			System.out.println(s);
		}
		
//		create substring
		ArrayList l = new ArrayList(list.subList(1, 3));
		System.out.println(list);
		
//		object to array
		Object[] o = list.toArray();
		System.out.println(o);
		System.out.println(Arrays.toString(o));
		

	}

}
