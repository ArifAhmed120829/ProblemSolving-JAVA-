package Java_classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class toph_1 {
	static int max(int a, int b) {
		return (a>b) ? a:b;
	}
	static int min(int a, int b) {
		return (a<b) ? a:b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();//1
		
		for(int i = 0; i<test_case; i++) {
			int test_case2 = in.nextInt();//5
			ArrayList<Integer> hi  =new ArrayList<>();
			ArrayList<Integer> bye  =new ArrayList<>();
			int max1 = 0;
			int min1 = 0;
			int[] arr = new int[test_case2];
			for(int j = 0; j<test_case2; j++) {
				arr[j] = in.nextInt();
			}
			int sol = test_case2;
			
			while(sol!=0) {
				if(test_case2 %2 == 0 ) {
					max1 = max(arr[test_case2-1],arr[test_case2 - 2]);
					min1 = min(arr[test_case2-1],arr[test_case2 - 2]);
					hi.add(max1);
					bye.add(min1);
					
					sol = sol -2;
					
				}
				else {
					max1 = max(max(arr[test_case2-1],arr[test_case2 - 2]), arr[test_case2 - 3]);
					min1 = min(min(arr[test_case2-1],arr[test_case2 - 2]), arr[test_case2 - 3]);
					hi.add(max1);
					bye.add(min1);
					sol = sol -3;
					
					
				}
				test_case2 = test_case2/2;
				if(test_case2<=1) break;
				
			}
			//System.out.println(hi);
			//System.out.println("max size: "+hi.size());
			//System.out.println("max number: "+Collections.max(hi));
			//System.out.println(bye);
			//System.out.println("min size: "+bye.size());
			//System.out.println("min number: "+Collections.min(bye));
			System.out.println(Collections.max(hi)+Collections.min(bye));
			
		}

	}

}
