package OOP.methodreturn;

public class Triangle extends Shape{

	private double base;
	private double height;
	
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double area() {
		
		double area = (base * height)/2;
		System.out.println("Area of Triangle = " +area);
		return area;
	}
}
