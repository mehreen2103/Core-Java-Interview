package OOP.abstracts;

abstract class Shape {

	abstract void area();
}

class Circle extends Shape {

	public int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	void area() {
		double area = 3.14 * radius * radius;
		System.out.println(" Area Circle : " + area);

	}

}

class Rectangle extends Shape {

	public int length;
	public int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	void area() {
		double area = length * width;
		System.out.println("Area Rectangle : " + area);

	}

}
