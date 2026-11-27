package Collection.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparable {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "Mehreen", "BCA"));
		list.add(new Employee(2, "Mehreen", "BCA"));
		list.add(new Employee(3, "Noshi", "BPT"));
		list.add(new Employee(4, "Inaya", "BBA"));

		Collections.sort(list);
//		 Collections.shuffle(list);

		for (Object o : list) {

			System.out.println(o);
		}
	}

}