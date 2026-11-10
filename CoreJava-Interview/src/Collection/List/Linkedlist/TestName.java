package Collection.List.Linkedlist;

import java.util.LinkedList;

public class TestName {
	
	public static void main(String[] args) {
		
		LinkedList<String> s = new LinkedList<String>();
		s.add("mehreen");
		s.add("noshi");
		s.add("inaya");
		
		System.out.println(s);;
		System.out.println("-------------=======");
		s.addFirst("bilal");
		System.out.println(s);
		System.out.println("-------------=======");
		s.addLast("Suleman");
		System.out.println(s);
		
	}
	

}
