import java.util.Scanner;

public class dhara_sum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		for(int i = 0; i<tc; i++) {
			int x = in.nextInt();
			int k = in.nextInt();
			System.out.println(rec(x,k));
		}

	}

	private static int rec(int num, int pow) {
		if(pow == 0) return 1;
		int res = num;
		for(int j = 1; j<pow; j++) {
			 res = res * num;
		}
		return res + rec(num,pow-1);
		
	}

}
