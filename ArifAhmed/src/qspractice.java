
public class qspractice {

	public static void main(String[] args) {
		int[] arr = {9,7,8,10,12,11};
		int length = arr.length;
		sort(arr,0,length-1);
		printArr(arr);
	}

	private static void printArr(int[] arr) {
		for(int val: arr) {
			System.out.println(val);
		}
		
	}

	private static void sort(int[] arr, int low, int high) {
		
		if(low>=high) {
			return;
		}
		int pivot = arr[high];
		int lp = low;
		int rp = high;
		
		while(lp<rp) {
			while(lp<rp && pivot<=arr[lp]) {//5>=10
				lp++;// if it is bigger than the pivot it will stay
			}
			while(lp<rp && pivot>=arr[rp]) {//5<=1
				rp--;// if it is smaller than the pivot it will stay
			}
			swap(arr,lp,rp);
		}
		swap(arr,lp,high);
		sort(arr,lp+1,high);
		sort(arr,low,lp-1);
		
	}

	private static void swap(int[] arr, int lp, int rp) {
		int temp = arr[lp];
		arr[lp] = arr[rp];
		arr[rp] = temp;
		
	}

}
