package CodeForces;

import java.util.Scanner;

public class NextRound {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int j = 0;
		int[] array = new int[n];
		for(int i =0; i<n; i++) {
			array[i] = in.nextInt();
		}
		
			if(array[j] != 0) {
				if(array[k-1] >= array[k] ) {
					k++;
				}
			}
				
			
		
		System.out.println(k);
		
		
	}

}
