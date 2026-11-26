package Collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "Mehreen", 5000));
		list.add(new Employee(3, "Mehreen", 3300));
		list.add(new Employee(2, "Noshi", 4000));
		list.add(new Employee(4, "Maha", 5000));

		System.out.println("---------By Name-------------");
		
		EmployeeShortByName byName = new EmployeeShortByName();

		Collections.sort(list, byName);

		for (Object o : list) {
			System.out.println(o);
		}

		System.out.println("==========By Id Name Slary==========");

		EmployeeShortByIdNameSalary byINS = new EmployeeShortByIdNameSalary();

		Collections.sort(list, byINS);

		for (Object o : list) {
			System.out.println(o);
		}

		System.out.println("-----------By ID Name-----------");

		EmployeeShortByIdName byIN = new EmployeeShortByIdName();

		Collections.sort(list, byIN);

		for (Object o : list) {
			System.out.println(o);
		}

	}
}
