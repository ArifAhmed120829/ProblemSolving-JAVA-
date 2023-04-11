import java.util.ArrayList;
import java.util.Collections;

public class subarray {

	public static void main(String[] args) {
		int[] array = {-2,1,-3,4,-1,2,1,-5,4};
		//print all sub array
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i<array.length; i++) {
			list.add(array[i]);
			int sum = array[i];
			for(int j = i+1; j<array.length; j++) {
				sum = sum+ array[j];
				list.add(sum);
			}
		}
		
		System.out.println(Collections.max(list));


	
	
		
		
		
	}
	class Solution {
	    public int maxSubArray(int[] nums) {
	        int sum = 0 , maxi = Integer.MIN_VALUE;;
	        int i = 0 , j = 0;
	        while(j<nums.length){
	           
	            if(sum < 0 && nums[j] >= sum){
	                sum = 0;
	                i = j;
	            }
	             sum += nums[j];
	            maxi = Math.max(maxi , sum);
	            j++;
	        }
	        return maxi;
	    }
	}

}
