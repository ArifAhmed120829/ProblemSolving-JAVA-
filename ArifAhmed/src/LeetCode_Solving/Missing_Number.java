package LeetCode_Solving;

import java.util.Arrays;

public class Missing_Number {

	public static void main(String[] args) {
		int[] arr = {3,0,1};
		System.out.println(mn(arr));

	}

	private static int mn(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0; i<nums.length; i++) {
			if(nums[i]!=i) {
				return i;
			}
		}
		return nums.length;
	}

}
