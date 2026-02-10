package p;
import java.util.Scanner;

public class JaggedArray {
	public static void main (String args []) {
		int arr[][] = new int[3][];
		
		arr[0] = new int [4];
		arr[1] = new int [1];
		arr[2] = new int [2];
		
		Scanner scc = new Scanner (System.in);
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.println ("Enter your value - ");
				
				arr[i][j] = scc.nextInt();
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print (arr[i][j]);
			}
			System.out.println ();
		}
	}
}
