package p;
import java.util.Scanner;

class StaticArray {
	void StaticArray1 () {
		int StaticArray [] = {1, 2, 3};
		for (int i = 0; i<StaticArray.length; i++) {
			System.out.println (StaticArray [i]);
		}
	}
}

class DynamicArray{
	int DynamicArray [] = new int [3];
	Scanner scc = new Scanner (System.in);
}

public class ArrayClass {
	
	public static void main (String args []) {
		StaticArray sa = new StaticArray ();
		DynamicArray da = new DynamicArray ();
		
		sa.StaticArray1();
		
		System.out.println ("Enter the values - ");
		
		for (int i = 0; i<da.DynamicArray.length; i++) {
			da.DynamicArray [i] = da.scc.nextInt ();
		}
		
		for (int i=0; i<da.DynamicArray.length; i++) {
				System.out.print (da.DynamicArray[i]);
		}
	}
}
