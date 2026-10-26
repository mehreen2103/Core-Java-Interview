package OOP.methodreturn;

public class Circle extends Shape{

	private double radius;
	
	public static final double PI = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		double area = PI * radius * radius;
		System.out.println("Area of Circle = " + area);
		return area;
	}
}
