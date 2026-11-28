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

//stream() => Collection ko Stream me convert karta hai.
//filter() =>	Condition ke according elements select karta hai.
//collect() =>	Stream ka result kisi collection me convert karta hai.
//Collectors.toList() =>	Stream ko List me convert karta hai.
//Collectors.collectingAndThen() =>	Collection banane ke baad us par extra operation perform karta hai.
//Collections.shuffle() =>	List ke elements ko random order me arrange karta hai.
//limit(2) => Random list me se 2 contestants leta hai.
//forEach() =>	Har element par given action perform karta hai.