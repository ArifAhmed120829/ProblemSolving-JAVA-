package LeetCode_Solving;

import java.util.ArrayList;
import java.util.Collections;

public class Richest_Customer_Wealth {
	public static int maximumWealth(int[][] accounts) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int sum;
		
		int j = 0;
		while(j!=accounts.length) {
			sum = 0;
			for(int i = 0; i<accounts[j].length; i++) {
				sum = sum + accounts[j][i];
			}
			list.add(sum);
			j++;
		}
		Collections.sort(list);
		return list.get(list.size()-1);
		
	        
	    }
	public static void main(String[] args) {
		int[][] array = {{1,2,3},{3,2,1}};
		int[][] array2 = {{1,5},{7,3},{3,5}};
		int[][] array3 = {{2,8,7},{7,1,3},{1,9,5}};
		
		System.out.println(maximumWealth(array));
		System.out.println(maximumWealth(array2));
		System.out.println(maximumWealth(array3));
	}
	

}

