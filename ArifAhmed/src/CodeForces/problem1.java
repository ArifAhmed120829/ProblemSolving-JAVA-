package codeforce;
import java.util.*;
public class problem1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		for(int i =0; i<t; i++) {
			int n = in.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			int[] arr= new int[n];
			for(int j = 0; j<n; j++) {
				arr[j] = in.nextInt();
				if(j==0) {
					if(arr[0] -1 > 0) list.add(arr[0]-1);
					else {
						list.add(arr[0]+1);
					}
				}
				else {
					int x = 1;
					int size = list.size();
					while(size==list.size()) {
						if(!list.contains(arr[j]-x) && list.get(j-1)< (arr[j] -x)) list.add(arr[j]-x);
						else if(!list.contains(arr[j]+x) && list.get(j-1)< (arr[j]+x)) list.add(arr[j]+x);
						else {
							if(arr[j] != list.get(j-1) + 1) {
								list.add(list.get(j-1) + 1);
							}
							else {
								list.add(list.get(j-1) + 2);
							}
							
						}
					}
				}
			}
			
			
			Collections.sort(list);
			System.out.println(list.get(list.size()-1));
			
		}

	}

}