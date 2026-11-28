package Collection.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestant {

	public static void main(String[] args) {

		List<Contestant> list = new ArrayList<>();

		list.add(new Contestant("Mehreen", "8446545215"));
		list.add(new Contestant("Noshi", "8784546874"));
		list.add(new Contestant("Inaya", "7654646864"));

		list.stream().filter(e -> e.mobileNo.length() == 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(2).forEach(e -> {
					System.out.println(e.name + " " + e.mobileNo);
				});
	}
}
