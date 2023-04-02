package LeetCode_Solving;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {1,2,1,2,4};
		int j = 0;
		while(j!=nums.length) {
			int i = 0;
			int x = 0;
			while( i != nums.length) {
				if(nums[j] == nums[i]) {
					x++;
				}
				i++;
			}
			if(x!=2) {
				
				break;
			}
			j++;
		}
		System.out.println(nums[j]);

	}

}
