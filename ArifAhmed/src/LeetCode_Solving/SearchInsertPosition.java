package LeetCode_Solving;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] arr = {1,3,5};
		int target = 4;
		System.out.println(searchInsert(arr,target));

	}

	private static int searchInsert(int[] arr, int target) {
		int mid;
		int low = 0;
		int high = arr.length - 1;
		while(low<=high) {
			mid = (low + high)/2;
			if(arr[mid]<target) {
				low = mid + 1;
			}
			else if(arr[mid]>target) {
				high = mid - 1;
			}
			else {
				return mid;
			}
		}
		return sorted(arr,target);
		
	}

	private static int sorted(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		int j = 0 ;
		if(low==high) {
			if(target<arr[low]) {
				return low;
			}
			else {
				return low + 1;
			}
		}
		while(low<high) {
			if(arr[low]<target && arr[high]>target) {
				j++;
				low++;
				high--;
			}
			else if(arr[low]>target) {
				return low;
			}
			else if(arr[high]<target) {
				return high+1;
			}
			
		}
		if(low==high) {
			if(arr[low]<target) {
				return low+1;
			}
			else {
				return low;
			}
			
		}
		else {
			return j;
		}
		
		
	}

}
