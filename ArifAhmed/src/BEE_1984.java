import java.util.Scanner;

public class BEE_1984 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		String str1 = Long.toString(x);
		reverse(str1);
		System.out.println();
		

	}
	public static void reverse(String s) {
		int j = s.length();
		int m = 0;
		char[] input;
		input = new char[j];
		for(int i  = j-1; i>=0; i--) {
			input[m] = s.charAt(i);
			m++;
		}
		for(int i = 0; i<j; i++) {
			System.out.print(input[i]);
		}
		
	}

}
