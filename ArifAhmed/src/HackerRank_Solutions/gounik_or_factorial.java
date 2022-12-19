package HackerRank_Solutions;

import java.util.Scanner;

public class gounik_or_factorial {

	public static void main(String[] args) {
	
		
			int num = 6;
			System.out.println(recursion(num));
		

	}

	private static int recursion(int num) {
		int res;
		if(num==0) {
			return 1;
		}
		
		else {
			res = recursion(num - 1) * num;
			System.out.println(res);
			return res;
		}
		
	}

}
