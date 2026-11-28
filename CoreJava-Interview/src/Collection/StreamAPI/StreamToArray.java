package Collection.StreamAPI;

import java.util.stream.Stream;

public class StreamToArray {
	
	public static void main(String[] args) {
		
		Stream<String> s = Stream.of("Mehreen", "Noshi", "Inaya");
		
		String[] arr = s.toArray(e -> new String[e]);
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}

}

//Stream.of()	Values se Stream create karta hai.
//toArray()	Stream ko Array me convert karta hai.
//arr.length	Array me total elements batata hai.