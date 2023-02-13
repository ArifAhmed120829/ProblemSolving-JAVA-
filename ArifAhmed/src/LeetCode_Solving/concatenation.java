package LeetCode_Solving;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Solution8285 {
    public long findTheArrayConcVal(int[] nums) {
    	Stack<Integer> st = new Stack<Integer>();//[2,52,4,7],[2,4,8]
    	Queue<Integer> qu = new LinkedList<>();
    	long res = 0;
    	int j;
    	int q;
    	int len = nums.length;
    	if(len%2==0) {
    		 j = nums.length/2-1;//4/2 = 2
    		 q = j+1;
    		for(int i = nums.length/2-1; i>=0; i--) {
        		st.push(nums[q]);
        		st.push(nums[j]);
        		j--;
        		q++;
        		
        	}
    		String[] arr = new String[len/2];
    		int[] arr2 = new int[len/2];
    		for(int x = 0; x<len/2; x++) {
    			arr[x] = String.valueOf(st.pop())+String.valueOf(st.pop());
    		}
    		for(int x = 0; x<len/2; x++) {
    			arr2[x] = Integer.parseInt(arr[x]);
    		}
    		for(int val:arr2) {
    			res = res + val;
    		}
    		
    	}
    	else {
    		j = nums.length/2-1;
    		q = nums.length/2+1;
    		
    		for(int i = nums.length/2-1; i>=0; i--) {
        		qu.offer(nums[j]);
        		qu.offer(nums[q]);
        		j--;
        		q++;
        		
        	}
    		String[] arr = new String[len/2];
    		int[] arr2 = new int[len/2];
    		for(int x = 0; x<len/2; x++) {
    			arr[x] = String.valueOf(qu.poll())+String.valueOf(qu.poll());
    		}
    		for(int x = 0; x<len/2; x++) {
    			arr2[x] = Integer.parseInt(arr[x]);
    		}
    		for(int val:arr2) {
    			res = res + val;
    		}
    		
    		res = res + nums[nums.length/2];
    		
    	}
    	return res;   
    }
}

public class concatenation {

	public static void main(String[] args) {
		Solution8285 ob = new Solution8285();
		int[] arr = {7,52,2,4};//673
		System.out.println(ob.findTheArrayConcVal(arr));
	}

}
