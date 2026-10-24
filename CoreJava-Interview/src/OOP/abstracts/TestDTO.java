package OOP.abstracts;

public class TestDTO {

	public static void main(String[] args) {
		
		UserDTO u = new UserDTO();
		
		System.out.println("ID : " + u.id);
		System.out.println("Table Name : " + u.getTableName());
		System.out.println("Unique Key : " + u.getUniqueKey());
	}
}
