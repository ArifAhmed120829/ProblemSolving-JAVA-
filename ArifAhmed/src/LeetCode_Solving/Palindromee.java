package LeetCode_Solving;

import java.util.Scanner;

class Palindrome{
public boolean isPalindrome(int x) {
	if(x==0) {
		return true;
	}
	if(x<0 || x%10==0) {
		return false;
	}
	int reversed_int = 0;
	while(x>reversed_int) {
		int pop = x%10;
		x = x/10;
		reversed_int = (reversed_int * 10)+ pop;
	}
	if(x==reversed_int || reversed_int/10  == x) {
		return true;
	}
	else {
		return false;
	}
    }
}

public class Palindromee {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		Palindrome obj = new Palindrome();
		System.out.println(obj.isPalindrome(x));

	}

}
