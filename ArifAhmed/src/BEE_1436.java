import java.util.Scanner;

public class BEE_1436 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		int Case = 1;
		for(int i = 0; i<test_case; i++) {
			int x = in.nextInt();
			int[] n = new int [x];
			float res = (float)(x)/(float)(2);
			for(int j = 0; j<x; j++) {
				n[j] = in.nextInt();
			}
			System.out.println("Case "+Case+": "+n[(int) Math.ceil(res)-1]);
			Case++;
		}
		

	}

}
