package CodeForces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OneandTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i =0; i<test_case; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			int n = in.nextInt();
			int[] arr = new int[n];
			for(int j = 0; j<n; j++) {
				
				arr[j] = in.nextInt();//2,2,1,2,1,2
				
			}
			int count = n-1;
			int k = 1;
			int a = 1;
			rec(arr,list,count,k,a);
			for(int val:list) {
				System.out.println(val);
			}
			//System.out.println(Collections.min(list));
			
		}

	}

	private static void rec(int[] arr, ArrayList<Integer> list, int count,int k, int a) {
		int k1 = 0;
		int k2 = arr.length-1;
		while(k1 < arr.length-1 && k2 > 0) {
			int len = arr.length-1;
			count = arr.length-1;
				
				while(k1 < len && arr.length-count <arr.length) {
					k = k * arr[k1];
					k1++;
					count--;
					
				}
				while(k2>0) {
					a = a* arr[k2];
					k2--;
				}
				if(k==a) list.add(count+1);
		}
		
		
		
	}

	

}
