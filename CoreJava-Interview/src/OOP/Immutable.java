package OOP;

public final class Immutable {
	
	private final String name;

    public Immutable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        Immutable s = new Immutable("Mehreen");

        System.out.println("Student Name : " + s.getName());
    }

}
