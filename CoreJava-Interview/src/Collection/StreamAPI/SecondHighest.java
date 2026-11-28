package Collection.StreamAPI;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {

		int[] arr = { 10, 30, 50, 40, 70, 80, 60, 90 };

		int secondHighest = Arrays.stream(arr).boxed().sorted((a, b) -> b - a).distinct().skip(1).findFirst().get();

		System.out.println(secondHighest);
	}

}

//boxed() =>	Primitive int ko Integer object me convert karta hai.
//distinct() =>	Duplicate elements remove karta hai.
//findFirst() =>	Stream ka pehla element return karta hai