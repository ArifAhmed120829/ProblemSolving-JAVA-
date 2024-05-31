package codeforce;

import java.util.*;

public class Morning {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i =0; i<t; i++) {
			int[] arr = {1,2,3,4,5,6,7,8,9,0};
			String s = in.next();
			int[] arr2 = new int[4];
			for(int j =0; j<4;j++) {
				int y = Character.getNumericValue(s.charAt(j));
				arr2[j] = y;
			}
			int x = 0;
			int c = 0;
			for(int j =0; j<4;j++) {
				if(arr[x] != 0 && arr2[j] != 0) {
					int r = (Math.abs(arr[x] - arr2[j]))+1;
					c = c + r;
					arr[x] = arr2[j];
				}
				else {
					if(arr[x] == 0 && arr2[j] != 0) {
						int r = (Math.abs(10-arr2[j]))+1;
						c = c+r;
						arr[x] = arr2[j];
					}
					else if(arr2[j] == 0 && arr[x] != 0) {
						int r = (Math.abs(arr[x]-10))+1;
						c = c+r;
						arr[x] = arr2[j];
					}
					else {
						int r = (Math.abs(arr[x] - arr2[j]))+1;
						c = c + r;
						arr[x] = arr2[j];
					}
						
					
				}
				
			}
			System.out.println(c);
		}
		

	}

}
