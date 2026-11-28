package Collection.StreamAPI;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {

		String[] str = { "abc", "aba" };
		
		Stream stream = Arrays.stream(str);
		
		stream.sorted().forEach(System.out::println);
	}

}

//Arrays.stream(array)=>	Array ko Stream me convert karta hai.
//sorted()=>	Stream ke elements ko ascending/alphabetical order me sort karta hai.
//forEach()=>	Har element par given action perform karta hai.
//System.out::println=>	Har element ko print karne ka method reference hai.