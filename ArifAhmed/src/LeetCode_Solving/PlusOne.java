package LeetCode_Solving;

import java.util.Arrays;

//Input: digits = [2,9,9]
//Output: [3,0,0]
class guy{
	public int[] result(int[] numbers) {
		int len = numbers.length;//3;
		for(int i = len-1; i>=0; i--) {
			if(numbers[i]<9) {
				numbers[i]++;//3
				return numbers;//{3,0,0}
			}
			numbers[i]=0;//0
		}
		int[] new_arr = new int[len+1];
		new_arr[0] = 1;
		return new_arr;
		
	}
}

public class PlusOne {

	public static void main(String[] args) {
		int[] arr = {2,9,9};
		guy ob = new guy();
		System.out.println(Arrays.toString(ob.result(arr)));

	}

}
