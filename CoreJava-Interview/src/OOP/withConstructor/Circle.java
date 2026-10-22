package OOP.withConstructor;

/**
 * @author mehre
 * example of shape array wirh constructor
 *  and this is child class
 *
 */
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
