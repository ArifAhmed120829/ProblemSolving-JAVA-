
public class qs {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int len = array.length;
		sort(array,0,len-1);
		printarray(array);
		
	}

	

	private static void sort(int[] arr, int low, int high) {
		
		if(low>= high) {
			return;
		}
		int pivot = arr[high];
		int lp = low;
		int rp = high;
		while(lp<rp) {
			while(pivot >= arr[lp] && lp<rp) {
				lp++;
			}
			while(pivot<=arr[rp] && lp<rp) {
				rp--;
			}
			swap(arr,lp,rp);
		}
		swap(arr,lp, high);
		//Partition done all the short element should be in left of it and big element should
		// be in the right of it
		sort(arr,low,lp-1);
		sort(arr,lp+1, high);
		
		
	}

	private static void swap(int[] arr, int lp, int rp) {
		int temp = arr[lp];
		arr[lp] = arr[rp];
		arr[rp] = temp;
		
	}
	private static void printarray(int[] array) {
		for(int value: array) {
			System.out.println(value);
		}
		
	}
	
	

}
