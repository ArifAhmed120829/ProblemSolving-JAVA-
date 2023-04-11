
public class diff_mergesort {

	public static void main(String[] args) {
		int[] array = {8,7,9,6,5,4,3,2};
		int[] helper = new int[array.length];
		mergesort(array,helper,0,array.length - 1);
		for(int val:array) {
			System.out.println(val);
		}

	}

	private static void mergesort(int[] array, int[] helper, int low, int high) {
		if(low<high) {
			int mid = (low + high)/2;
			mergesort(array,helper,low,mid);//sort left half
			mergesort(array,helper,mid + 1, high);//sort right half
			merge(array,helper,low,mid, high);
		}
		
	}

	private static void merge(int[] array, int[] helper, int low, int mid, int high) {
		for(int i = low; i<=high; i++) {
			helper[i] = array[i];
		}
		int helperleft = low;
		int helperright = mid+1;
		int curr = low;
		while(helperleft<=mid && helperright <= high) {
			if(helper[helperleft]<=helper[helperright]) {
				array[curr] = helper[helperleft];
				helperleft++;
			}
			else {
				array[curr] = helper[helperright];
				helperright++;
			}
			curr++;
		}
		int rem = mid - helperleft;
		for(int i = 0; i<=rem; i++) {
			array[curr + i] = helper[helperleft+i];
		}
		
	}

}
