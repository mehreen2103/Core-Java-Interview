package Collection.List.VectorStack;

import java.util.Stack;

public class AToZStack {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
//		push() jis element ko add karta hai usi ko return bhi karta hai.
		for (char ch ='a'; ch <='z'; ch++) {
			System.out.println(s.push(ch)); 
		}
		
		System.out.println("-----------------------------------");
		Stack s1 = new Stack();

//		pop()=> Top element remove karke return karta hai.
		while (!s.empty()) {
			System.out.println(s1.push(s.pop()));
		}
		System.out.println();
		
		System.out.println("-----------------------------");
		System.out.println(s);
		System.out.println("-----------------------------");
		System.out.println(s1);
	}

}
