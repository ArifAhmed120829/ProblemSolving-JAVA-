package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Contest_ConsecutiveSum {
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = new String[100];
		String[] line2 = new String[100];
		int test_cases = Integer.parseInt(in.readLine());
		for(int i = 0; i<test_cases; i++) {
			int[] arr;
			int g = 1;
			line1 = in.readLine().split(" ");
			line2 = in.readLine().split(" ");
			int n = Integer.parseInt(line1[0]);//3
			arr = new int[n];
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j = 0; j<n;j++) {
				arr[j] = Integer.parseInt(line2[j]);	
			}
			for(int j = 0; j<n;j++) {
				if(g+1<n) {
					list.add(Math.max(arr[j], arr[g]))  ;
				}
				
			}
			Collections.sort(list);
			System.out.println(list);
			System.out.println(list.get(list.size() - 1)+list.get(list.size() - 2));
		}

	}

}
