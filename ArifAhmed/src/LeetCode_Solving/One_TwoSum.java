package LeetCode_Solving;


import java.util.Arrays;

class Solution2145 {
    public static int[] twoSum(int[] nums, int target) {
    	int[] arr = new int[2];
        for(int i = 0; i<nums.length; i++) {
        	for(int j = i+1;j<nums.length; j++) {
        		if(nums[i]+nums[j] == target) {
        			arr[0]  = i;
        			arr[1] = j;
        		}
        	}
        }
		return arr;
        
    }
}

public class One_TwoSum {

	public static void main(String[] args) {
		int[] nums1 = {2,7,11,15};
		int[] nums2 = {3,2,4};
		int[] nums3 = {3,3};
		int target1 = 9;
		int target2 = 6;
		int target3 = 6;
		System.out.println(Arrays.toString(Solution2145.twoSum(nums1,target1)));
		System.out.println(Arrays.toString(Solution2145.twoSum(nums2,target2)));
		System.out.println(Arrays.toString(Solution2145.twoSum(nums3,target3)));

	}



}
