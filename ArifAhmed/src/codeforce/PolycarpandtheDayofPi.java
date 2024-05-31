package CodeForces;

import java.util.Scanner;

public class PolycarpandtheDayofPi {
	public static String data = "314159265358979323846264338327";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			String input = in.next();
			int count = 0;
			int  j= 0;
			while(j!= input.length()) {
				if(input.charAt(0) != '3') {
					j= input.length();
				}
				else {
					if(input.charAt(j) == data.charAt(j)) {
						count++;
					}
					j++;
				}
			}
			
			System.out.println(count);
		}
		

	}
	
}
