package LeetCode_Solving;

public class BinarySearch {

	public static void main(String[] args) {
		int[] n = { -1, 0, 3, 5, 9, 12 };
		int t = 9;
		System.out.println(search(n, t));

	}

	public static int search(int[] nums, int target) {
		int low,high,mid;
		low = 0;
		high = nums.length - 1;
		while(low<=high) {
			mid = (low + high)/2;
			if(target>nums[mid]) {
				low = mid + 1;
			}
			else if(target<nums[mid]) {
				high = mid - 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}
