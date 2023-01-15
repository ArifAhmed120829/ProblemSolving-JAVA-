package LeetCode_Solving;
class Solution891 {
    public int differenceOfSum(int[] nums) {
        int len = nums.length;
        int s1 = 0;
        int s2 = 0;
        for(int i = 0; i<len; i++) {
        	s1 = s1 + nums[i];//25
        }
        for(int i = 0; i<len; i++) {
        	if(nums[i]>9) {
        		int z = 0;
    			while(nums[i]!=0) {
    				z = z + (nums[i]%10);//5+1
    				nums[i] = nums[i]/10;
    			}
    			s2 = s2 + z;
    		}
        	s2 = s2 + nums[i];//0+1,
        	
        }
        int res = s1-s2;
        return Math.abs(res);
    }
}


public class Sum {

	public static void main(String[] args) {
		int[] n = {1,2,3,4};
		Solution891 ob = new Solution891();
		System.out.println(ob.differenceOfSum(n));
		
		
		

	}

}
