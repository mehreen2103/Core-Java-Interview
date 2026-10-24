package OOP.abstracts;

abstract class Teacher {

	public void attendence() {
		System.out.println("Attendence is taken");
	}
	
	public abstract void teachSubject();
}

class MathTeacher extends Teacher{

	@Override
	public void teachSubject() {
		System.out.println("Teaching Mathematics");
	}
	
}