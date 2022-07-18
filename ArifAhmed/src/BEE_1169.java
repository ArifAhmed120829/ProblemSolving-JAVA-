import java.util.Scanner;

public class BEE_1169 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			int x= in.nextInt();
			System.out.println((long) (Math.pow(2, x)/12000)+" kg");
		}

	}

}
