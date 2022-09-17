package Java_classes;

import java.util.Scanner;

public class oneD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	     // Prints each sequential element in array a
	        int[] a = new int[n];
	        for (int i = 0; i < a.length; i++) {
	            a[i] = scan.nextInt();
	        }

	        scan.close();

	        
	        for (int i = 0; i < a.length; i++) {
	            System.out.println(a[i]);
	        }

	}

}
