package Collection;

public class AutoboxingUnboxing {

	public static void main(String[] args) {

//		Autoboxing
		int a = 1;
		Integer b = a;

		System.out.println("Wrapper Int :" + b);

		
//		Unboxing
		Integer c = new Integer(15);
		int d = c;
		System.out.println(d);

	}

}

//AutoBoxing
//Primitive data type ko Wrapper Class Object me convert karna AutoBoxing kehlata hai.

//Unboxing
//Wrapper Class Object ko Primitive data type me convert karna Unboxing kehlata hai.