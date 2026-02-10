package p;

class A {
	void display() {
		System.out.println ("Today's weather is very pleasant.");
	}
}

class B extends A {
	void display_1() {
		System.out.println ("Today's weather is very not pleasant. Class A is spreading rumour.");
	}
}

public class SingleInheritance {
	
	public static void main (String args []) {
		B b = new B ();
		b.display();
		b.display_1();
	}

}
