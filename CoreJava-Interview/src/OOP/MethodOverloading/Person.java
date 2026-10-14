package OOP.MethodOverloading;

public class Person {
	
//	Login by loginid
	public void login(String loginId) {
		System.out.println(loginId);
	}
	
//	login by loginid & password
	public void login(String loginId, String password) {
		System.out.println(loginId + password);
	}
	
//	login by loginid, password & name
	public void login(String loginId, String password, String name) {
		System.out.println(loginId + password + name);
	}

}
