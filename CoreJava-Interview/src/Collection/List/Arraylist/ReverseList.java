package Collection.List.Arraylist;

import java.util.ArrayList;
import java.util.List;

public class ReverseList {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add("6");
		l.add("9");
		l.add("3");
		l.add("2");
		
		System.out.println(l);
		
		for(int i=l.size()-1;i>=0;i--) {
			
			System.out.println(l.get(i));
		}
		
	}

}
