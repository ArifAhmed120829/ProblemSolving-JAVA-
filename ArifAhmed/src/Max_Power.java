
public class Max_Power {

	public static void main(String[] args) {
		int[] arr = {1,2,5};
		// here ans == 3-2 -> 1 4-1 ->3 sort will be 2,3,1,4
		int len = arr.length;//4
		quicksort(arr,0,len-1);//0-3
		printarr(arr);

	}

	private static void printarr(int[] arr) {
		int max_val = arr.length-1;
		int min_val = 0;
		System.out.println(arr[max_val] - arr[min_val]);
		
		
	}

	private static void quicksort(int[] arr, int low, int high) {
		if(low>high) {
			return;
		}
		int pivot = arr[high];//1
		int lp = low;
		int rp = high;
		
	
		while(lp<rp) {
			while(lp<rp && pivot>=arr[lp]) {
				lp++;
			}
			while(lp<rp && pivot<=arr[rp] ) {
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
