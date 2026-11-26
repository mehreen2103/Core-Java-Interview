package Collection.Comparable;
import java.util.ArrayList;
import java.util.Collections;

public class TestFirstLast {
	public static void main(String[] args) {

		ArrayList<FirstLast> l = new ArrayList<FirstLast>();

		l.add(new FirstLast("Mehreen", "Ansari"));
		l.add(new FirstLast("Mehreen", "Ansari"));
		l.add(new FirstLast("Maha", "Khan"));
		l.add(new FirstLast("Noshi", "Ansari"));
		l.add(new FirstLast("Noshi", "Ansari"));
		l.add(new FirstLast("Sana", "Sheikh"));
		
		
		Collections.sort(l);
		for(FirstLast e : l) {
			System.out.println(e);
		}
	}

}