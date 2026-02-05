package p;

class Values {
	int r, l, b, s;
}

public class AreaPerimeter {
	
	public static void main(String[] args) {
		
		Values obj1 = new Values();
		obj1.r = 5;
		obj1.l = 10;
		obj1.b = 20;
		obj1.s = 40;
		
		System.out.println ("Area of circle is "+ 3.14*(obj1.r)*(obj1.r));
		System.out.println ("Circumference of circle is "+ 2*3.14*(obj1.r));
		System.out.println ("Area of square is "+ (obj1.s)*(obj1.s));
		System.out.println ("Area of rectangle is "+ (obj1.l)*(obj1.b));
		System.out.println ("Perimeter of rectangle is "+ 2*((obj1.l)+(obj1.b)));
		System.out.println ("Perimeter of square is "+ 4*(obj1.s));
	}


}
