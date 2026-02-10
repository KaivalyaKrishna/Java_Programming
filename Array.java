package p;
import java.util.Scanner;

public class Array {
	
	public static void main (String args []) {
		int StaticArray [] = {1, 2, 3};
		for (int i = 0; i<StaticArray.length; i++) {
			System.out.println (StaticArray [i]);
		}
		
		int DynamicArray [] = new int [3];
		Scanner scc = new Scanner (System.in);
		
		System.out.println ("Enter the values - ");
		
		for (int i = 0; i<DynamicArray.length; i++) {
			DynamicArray [i] = scc.nextInt ();
		}
		
		for (int i=0; i<DynamicArray.length; i++) {
				System.out.print (DynamicArray[i]);
		}
	}
}
