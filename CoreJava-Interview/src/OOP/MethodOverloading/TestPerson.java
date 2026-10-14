package OOP.MethodOverloading;

public class TestPerson {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.login("mehreenansari2023@gmail.com");
		
		p.login("mehreenansari2023@gmail.com", " 12345");
		
		p.login("mehreenansari2023@gmail.com", " 12345", " mehreen");
	}

}
