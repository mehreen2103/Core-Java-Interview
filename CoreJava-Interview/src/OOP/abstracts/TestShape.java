package OOP.abstracts;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s = new Circle(4);
		Shape s1 = new Rectangle(2, 4);
		s.area();
		s1.area();
	}

}
