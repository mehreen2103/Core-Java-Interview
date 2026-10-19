package OOP.constructor;

public class ConstructorCalling {
	
	public String fname;
	public String lname;
	
	public ConstructorCalling() {
		
	}

	public ConstructorCalling(String fname) {
		this();
		this.fname = fname;
		System.out.println(fname);
	}
	
	public ConstructorCalling(String fname, String lname) {
		this(fname);
		this.lname = lname;
		System.out.println(lname);
	}
}
