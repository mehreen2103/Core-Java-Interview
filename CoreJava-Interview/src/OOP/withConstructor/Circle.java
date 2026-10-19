package OOP.withConstructor;

public class Circle extends Shape{
	
	public int radius;
	
	public static final double PI = 3.14;
	
	public Circle(int radius) {
		this.radius = radius;
	}


	@Override
	public double area() {
		return PI * radius * radius;
	}
}
