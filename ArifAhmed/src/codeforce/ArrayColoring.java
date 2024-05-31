package codeforce;

import java.util.Scanner;

public class ArrayColoring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int l = 0; l<t; l++) {
			int len = in.nextInt();
			int[] arr = new int[len];
			int mid = len/2;
			int[] red = new int[mid];
			int[] blue = new int[len-mid];
			
			int r = 0;
			int b = 0;
			
			for(int i = 0; i<len; i++) {
				int el = in.nextInt();
				arr[i] = el;
				if(r<mid) {
					red[r] = arr[i];
					r++;
				}
				else {
					blue[b] = arr[i];
					b++;
				}
				
				
			}
			int r_sum = 0,b_sum = 0;
			
			for(int val:red) {
				r_sum = r_sum + val;
			}
			for(int val:blue) {
				b_sum = b_sum + val;
			}
			if(r_sum %2 ==0 && b_sum%2==0 || r_sum %2 !=0 && b_sum%2 !=0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
		

	}

}
