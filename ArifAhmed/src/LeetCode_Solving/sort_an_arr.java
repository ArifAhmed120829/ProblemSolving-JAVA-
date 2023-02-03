package LeetCode_Solving;

class Solution847 {
    public int[] sortArray(int[] nums) {
    	int high = nums.length-1;
    	if(nums.length <1000  ) {
    		sort(nums,0,high);
    	}
    	else {
    		mergeSort(nums, 0, nums.length - 1);
    	}
    	
    	
		return nums;
        
    }
    private void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (high - low) / 2 + low;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            mergeFun(arr, low, middle, high);
        }
    }
    static void mergeFun(int[] arr, int l, int m, int r) {
        int n1 = m + 1 - l;
        int n2 = r - m;
        int[] left = new int[n1];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        int[] right = new int[n2];
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 || j < n2) {
            if (j == n2 || i < n1 && left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
    }

	private void sort(int[] nums, int low, int high) {
		if(low>=high) {
			return;
		}
		int pivot = nums[high];
		int lp = low;
		int rp = high;
		while(lp<rp) {
			while(lp<rp && pivot>= nums[lp]) {
				lp++;
			}
			while(lp<rp && pivot<=nums[rp]) {
				rp--;
			}
			swap(nums,lp,rp);
		}
		swap(nums,lp,high);
		sort(nums,lp+1,high);
		sort(nums,low,lp-1);
		
	}

	private void swap(int[] nums, int lp, int rp) {
		int temp = nums[lp];
		nums[lp] = nums[rp];
		nums[rp] = temp;
		
	}
}

public class sort_an_arr {

	public static void main(String[] args) {
		int[] arr = {5,1,1,2,0,0};
		Solution847 ob = new Solution847();
		ob.sortArray(arr);
		for(int val: arr) {
			System.out.println(val);
		}
 
	}

}
