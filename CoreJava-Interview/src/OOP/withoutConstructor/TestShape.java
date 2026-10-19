package OOP.withoutConstructor;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape[] s = new Shape[1];
		
		s[0] = new Circle();
		
		Circle c = (Circle) s[0];
		
		c.setRadius(122);
		
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
		}
	}

}
