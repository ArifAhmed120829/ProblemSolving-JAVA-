package LeetCode_Solving;

import java.util.Scanner;
class reverse_int22{
	public int reverse(int x) {
		String s = String.valueOf(x);
		String res = "";
		int minus= 0;
		int j = s.length()-1;
		while(j>=0) {
			char value = s.charAt(j);
			if(value=='-') {
				j--;
				minus++;
				continue;
			}
			res = res + value;
			j--;
		}
		int rev = 0;
		 rev = Integer.valueOf(res);
		 if(minus==1) {
				rev = rev - (rev*2);
				return rev;
			}
			else {
				return rev;
			}
		
		
		
		
	}
}

public class practicing_rev_int {

	

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			 try {
				 int x1 = in.nextInt();
				reverse_int22 r = new reverse_int22();
				System.out.println(r.reverse(x1));
					
			    } catch (Exception InputMismatchException) {
			      System.out.println(0);
			    }
			
			/*
			 * x = 123
			 * 
			 */

		}

	


}
