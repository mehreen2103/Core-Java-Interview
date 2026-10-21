package OOP.MethodOverriding;

import OOP.User;

public class TestDTO {

	public static void main(String[] args) {
		
		
//		Method Overriding
		UserDTO dto = new UserDTO();
		dto.display();
		
		System.out.println("------------------");
		
//		Runtime Polymorphism
		BaseDTO dto1 = new UserDTO();
		dto1.display();
	}
}
