
public class mergesort2 {

	public static void main(String[] args) {
		int[] arr = {4,1,3,9,7};
		int[] helper = new int[arr.length];
		merge(arr,helper,0,arr.length-1);
		for(int val:arr) {
			System.out.println(val);
		}
	}

	private static void merge(int[] arr,int[]helper, int low, int high) {
		if(low<high) {
			int mid = (low + high)/2;
			merge(arr,helper,low,mid);
			merge(arr,helper,mid+1,high);
			sort(arr,helper,low,mid,high);
		}
		
	}

	private static void sort(int[] arr, int[] helper, int low, int mid, int high) {
		for(int i = 0; i<arr.length; i++) {
			helper[i] = arr[i];
		}
		int helperleft = low;
		int helperright = mid+1;
		int current = low;
		while(helperleft<=helperright && helperright<=high) {
			if(helper[helperleft]<=helper[helperright]) {
				arr[current] = helper[helperleft];
				helperleft++;
			}
			else {
				arr[current] = helper[helperright];
				helperright++;
			}
			current++;
		}
		int remaining = (mid-helperleft);
		for(int i = 0; i<=remaining; i++) {
			arr[current+i] = helper[helperleft+i];
		}
	}

}
