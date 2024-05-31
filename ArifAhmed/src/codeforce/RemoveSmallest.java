package codeforce;
import java.util.*;

public class RemoveSmallest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i =0; i<t; i++) {
			int n = in.nextInt();
			int[] arr = new int[n];
			
			
			for(int j =0; j<n; j++) {
				arr[j] = in.nextInt();
			}
			Arrays.sort(arr);
			if(n==1) {
				System.out.println("YES");
			}
			else {
				
				int x = n;
				for(int o  = 0; o+1< x; o++) {
					int minus = arr[o] - arr[o+1];
					if(Math.abs(minus) <=1) n--;
					
				}
				
				if(n==1) System.out.println("YES");
				else System.out.println("NO");
			}
		
			
			
		}
		
		
	}

}
