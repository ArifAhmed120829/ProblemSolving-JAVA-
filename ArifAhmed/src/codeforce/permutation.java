package codeforce;
import java.util.*;
public class permutation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<t; i++) {
			int c = 0;
			int s = in.nextInt();
			int[] arr = new int[s];
			for(int h = 0; h<s; h++) {
				arr[h] = in.nextInt();
			}
				for(int i2 =0; i2+1<arr.length; i2++) {
					if(arr[i2] == i2+1) {
						for(int j = i2+1; j<arr.length; j++) {
							if(arr[j]==j+1) {
								int temp = arr[i2];
								arr[i2] = arr[j];
								arr[j] = temp;
								c++;	
							}
						}
						
					}
					
				}
				list.add(c);
			
			
		}
		for(int v:list) {
			System.out.println(v+" ");
		}
		
		
		

	}

}
//if(arr[i] == i+1 || arr[i+1] == i+2) {
//int temp = arr[i];
//arr[i] = arr[i+1];
//arr[i+1] = temp;
//c++;
//}