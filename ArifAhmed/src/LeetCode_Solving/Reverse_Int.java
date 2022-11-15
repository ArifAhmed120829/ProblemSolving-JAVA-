package LeetCode_Solving;

import java.util.Scanner;
class Reverse_Int2{
	public int reverse(int x) {
		int rev = 0;
		int pop;
		while(x!=0) {
			pop = x%10;
			x = x/10;
			if(rev>Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && pop>7) return 0;
			if(rev<Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && pop<-8) return 0;
			rev = (rev*10)+pop;
		}
		return rev;
	}
}

public class Reverse_Int {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		Reverse_Int2 obj = new Reverse_Int2();
		System.out.println(obj.reverse(x));

	}

}
