package LeetCode_Solving;

class Solution801{
	 public int removeElement(int[] nums, int val) {
		 int c = 0;
		 for(int i = 0; i<nums.length; i++) {
			 if(nums[i] != val) {
				 nums[c] = nums[i];
				 c++;
			 }
		 }
		 return c;
	 }
}

public class Remove_Element2 {

	public static void main(String[] args) {
		Solution801 ob = new Solution801();
		int[] nums = {0,1,2,2,3,0,4,2}; // Input array
		int val = 2; // Value to remove
		System.out.println(ob.removeElement(nums, val));

	}

}
