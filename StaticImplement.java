package p;

class Employee{
	String name;
	int id;
	static String org;
	
	static {
		org = "ABES";
		System.out.println ("Static Block Implemented");
	}
	
	public static void show (Employee e) {
		e.name = "Ram";
		e.id = 420;
		System.out.println ("Static Method Implemented");
	}
	void display () {
		System.out.println (name + " " + id + " " + org);
	}
	
}

public class StaticImplement {
	public static void main (String args []) {
		Employee e = new Employee ();
		e.display();
		Employee.show (e);
		e.display();
		
	}

}
