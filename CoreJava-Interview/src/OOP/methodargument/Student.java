package OOP.methodargument;

public class Student {
	
	public void display(String name, int age) {

        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.display("Mehreen", 22);

    }

}
