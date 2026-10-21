package OOP.MethodOverriding;

public class TestAnimal {

	public static void main(String[] args) {

		// Normal Object
		Dog d = new Dog();
		d.sound();

		System.out.println("----------------");

		// Runtime Polymorphism
		Animal a = new Dog();
		a.sound();
	}
}