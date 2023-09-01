package codeforce;
import java.util.Stack;

public class Maximum_Rounding {

	public static void main(String[] args) {
		

		Stack<Integer> st = new Stack<>();
		
		int[] arr = {9,1,3};
		int cnt = 0;
		for(int val:arr) {
			st.push(val);
		}
		for(int i = arr.length-1; i >=0 ; i--) {
			if(arr[i] >=5 ) {
				arr[i] = 0;
				cnt++;
			}
			else if(arr[i] < 5 && cnt >0) {
				arr[i] = arr[i] +1;
				if(arr[i] >= 5) {
					arr[i] = 0;
					cnt++;
				}
				else {
					cnt = 0;
				}
				
			}
			
		}
		int[] arr2 = new int[arr.length+1];
		if(cnt != 0) {
			
			int j = 0;
			arr2[j] = 1;
			j++;
			for(int val:arr) {
				arr2[j] = val;
				j++;
			}
			for(int val:arr2) {
				System.out.println(val);
			}
			
			
		}
		else {
			for(int val:arr) {
				System.out.println(val);
			}
		}
		
		
		
		
		

	}

}
