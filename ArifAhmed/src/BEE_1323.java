import java.util.Scanner;

public class BEE_1323 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(;;) {
			int n  = in.nextInt();
			if (n == 0) break;
			int res = (n*(n+1)*(2*n+1))/6;
			System.out.println(res);
		}

	}

}
