package codeforce;
import java.util.*;

public class prb1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//System.out.println();
		int t = in.nextInt();//test_case
		for(int i =0;i<t; i++) {
			int n = in.nextInt();// the length of the array
			int[] arr = new int[n];
			for(int j =0; j<n;j++) arr[j] = in.nextInt();
			if(isSorted(arr)) System.out.println("YES");
			else {
				int m = 0;
				int p_m = (int)Math.pow(2, m);
				while(p_m <= n) {
					
					int p = 0;
					while(p<p_m) {
						arr[p] = arr[p] - p_m;
						p++;
					}
					m++;
					p_m = (int)Math.pow(2, m);
					
				}
				if(isSorted(arr)) System.out.println("YES");
				else System.out.println("NO");
			}
		}
	}

	public static boolean isSorted(int[] arr) {
	    for (int i = 0; i < arr.length - 1; i++) {
	        if (arr[i] > arr[i + 1]) {
	            return false;
	        }
	    }
	    return true;
	}

}
