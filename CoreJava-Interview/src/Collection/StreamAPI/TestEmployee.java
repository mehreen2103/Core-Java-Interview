package Collection.StreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<>();

		employees.add(new Employee("A", 50000));
		employees.add(new Employee("B", 70000));
		employees.add(new Employee("C", 60000));
		employees.add(new Employee("D", 20000));
		employees.add(new Employee("E", 80000));
		employees.add(new Employee("E", 80000));

		// firstHighest
		employees.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).limit(1)
				.forEach(System.out::println);

		System.out.println("----------SecondHighest---------");
		employees.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder()).skip(1).limit(1)
				.forEach(System.out::println);

		System.out.println("-----Salary greator than 20000------");

		employees.stream().filter(e -> e.getSalary() > 20000).forEach(e -> System.out.println(e.getSalary()));

		System.out.println("-----------AccendingOreder----------");
		
		// ascending order
		employees.stream().map(e -> e.getSalary()).distinct().sorted().forEach(System.out::println);
		System.out.println("-------------firstLowest-----------");
		employees.stream().map(e -> e.getSalary()).distinct().sorted().limit(1).forEach(System.out::println);
		System.out.println("------------SecondLowest---------");
		employees.stream().map(e -> e.getSalary()).distinct().sorted().skip(1).limit(1).forEach(System.out::println);

	}

}
//
//| `stream()` | Collection ko Stream me convert karta hai. |
//| `map()` | Har object ko kisi aur value me convert karta hai. |
//| `distinct()` | Duplicate elements remove karta hai. |
//| `sorted()` | Elements ko ascending order me sort karta hai. |
//| `sorted(Comparator.reverseOrder())` | Elements ko descending order me sort karta hai. |
//| `filter()` | Condition ke according elements select karta hai. |
//| `skip(n)` | Shuru ke `n` elements ko skip karta hai. |
//| `limit(n)` | Sirf pehle `n` elements leta hai. |
//| `forEach()` | Har element par action perform karta hai. |
//| `Comparator.reverseOrder()` | Reverse (descending) sorting ke liye comparator deta hai. |