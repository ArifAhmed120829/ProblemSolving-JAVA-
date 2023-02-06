package LeetCode_Solving;

public class sort_colors {

	public static void main(String[] args) {
		int[] arr = {2,0,2,1,1,0};
		int len = arr.length;
		quicksort(arr,0,len - 1);
		printarr(arr);

	}

	private static void printarr(int[] arr) {
		for(int val: arr) {
			System.out.println(val);
		}
		
	}

	private static void quicksort(int[] arr, int low, int high) {
		if(low>high) {
			return;
		}
		int pivot = arr[high];
		int lp = low;
		int rp = high;
		while(lp<rp) {
			while(lp<rp && pivot >= arr[lp] ) {
				lp++;
			}
			while(lp<rp && pivot <= arr[rp]) {
				rp--;
			}
			swap(arr,lp,rp);
		}
		swap(arr,lp,high);
		quicksort(arr,low,lp-1);
		quicksort(arr,lp+1,high);
		
	}

	private static void swap(int[] arr, int lp, int rp) {
		int temp = arr[lp];
		arr[lp] = arr[rp];
		arr[rp] = temp;
		
	}

}
