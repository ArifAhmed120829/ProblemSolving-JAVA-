import java.util.Scanner;

public class BEE_2544 {
	static int result = 0;
	public static int func(int n) {
		n = n /2;
		if(n==1) {
			result++;
			return result;
		}
		else {
			result++;
			return func(n);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();
			result = 0;
			if(n>1) {
				System.out.println(func(n));
			}
			else {
				System.out.println(n/2);
			}
		}
		

	}

}
