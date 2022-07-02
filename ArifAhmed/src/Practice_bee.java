import java.util.Scanner;

public class Practice_bee {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = {5,7,1,-5,5,10};
		int len = arr.length;
		int L = 0;
		int[] res = new int[arr.length];
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					L++;
				}
			}
			L = len-L-1;//3,4,0
			if(arr[i]==res[L]) {
				L = L-1;
				res[L] = arr[i];
				L =0;
			}
			else {
				res[L] = arr[i];
				L = 0;
			}
		}
		for(int k = 0; k<arr.length; k++) {
			System.out.print(res[k]+" ");
		}
		System.out.println();
		System.out.println("The smallest element is "+res[0]+" And The second smallest elements of the array is: "+res[1]);
		
	}

}
