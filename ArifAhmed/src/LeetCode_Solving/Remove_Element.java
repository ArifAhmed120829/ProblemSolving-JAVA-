package LeetCode_Solving;
class Solution800 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;//4
        int count = 0;
        int h = 0;
        int[] new_arr = new int[length];
        for(int i = 0; i<length; i++) {
        	if(val==nums[i]) {
        		count++;
        		continue;
        	}
        	new_arr[h] = nums[i];
        	h++;
        	
        }
        int k = length - count;
        while(count!=length) {
        	new_arr[h] = 0;
        	count++;
        }
        for(int value: new_arr) {
        	System.out.print(value+" ");
        }
        System.out.println();
        return k;
        
    }
}

public class Remove_Element {

	public static void main(String[] args) {
		Solution800 ob = new Solution800();
		int[] nums = {0,1,2,2,3,0,4,2}; // Input array
		int val = 2; // Value to remove
		System.out.println(ob.removeElement(nums, val));
		
	
	}

}
