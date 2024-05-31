package CodeForces;

import java.util.Scanner;

public class contestFeb25 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			int len = in.nextInt();
			int[] arr = new int[len];
			int c = 0;
			for(int j = 0; j<len; j++) {
				arr[j] = in.nextInt();
			}
			for(int j = 0; j<len; j++) {
				if(arr[j]%2==0) {
					c++;
				}
			}
			if(c<len) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			
		}
		

	}

	

}
