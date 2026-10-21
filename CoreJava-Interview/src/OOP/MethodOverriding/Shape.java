package OOP.MethodOverriding;

/**
 * @author mehre
 * 
 * example of methodOverriding
 * this is parent class
 * 
 *
 */
public class Shape {

	public String colour;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public double area() {
		return 0;
	}
}
