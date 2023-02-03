import java.util.Scanner;

public class A_cricket_tournament {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] arr1 = new int[size];
		int[] arr2 = new int[size];
		for(int i = 0; i<size; i++) {
			arr1[i] = in.nextInt();
		}
		for(int i = 0; i<size; i++) {
			arr2[i] = in.nextInt();
		}
 		// first array sort as highest to lowest
		// Second array sort as lowest to highest
		// Then return the max minus element both of the array
		int len1 = arr1.length;
		int len2 = arr2.length;
		sort(arr1, 0, len1 - 1);
		sort2(arr2, 0, len2 - 1);
		printArr(arr1,arr2);
	}

	private static void sort(int[] a, int low, int high) {
		//find pivot
		if(low>=high) {
			return;
		}
		int pivot = a[high];//5
		int lp = low;//0
		int rp = high;//4
		
		
		
		while(lp<rp) {//0<4
			while(pivot <= a[lp] && lp<rp) {//!5<=1,
				lp++;//
			}
			while(pivot >= a[rp] && lp<rp) {//5>=5
				rp--;
			}
			swap(a,lp,rp);//0,3
			
		}
		swap(a,lp,high);
		sort(a,lp+1,high);
		sort(a,low,lp-1);
		
	}

	private static void sort2(int[] a, int low, int high) {
		//find pivot
		if(low>=high) {
			return;
		}
		int pivot = a[high];
		int lp = low;
		int rp = high;
		
		
		
		while(lp<rp) {//0<4
			while(pivot >= a[lp] && lp<rp) {
				lp++;//
			}
			while(pivot <= a[rp] && lp<rp) {
				rp--;
			}
			swap(a,lp,rp);
			
		}
		swap(a,lp,high);
		sort2(a,low,lp-1);
		sort2(a,lp+1,high);
		
	}

	private static void swap(int[] a, int lp, int rp) {
		int temp = a[lp];
		a[lp] = a[rp];
		a[rp] = temp;
		
	}

	private static void printArr(int[] a, int[] b) {
		int len = b.length;
		long sum = 0;
		int c = 0;
		for(int val: a) {
			if(val - b[c] >0 ) {
				sum = sum + (val-b[c]);
			}
			c++;
		}
		System.out.println(sum);
		
	}

}
