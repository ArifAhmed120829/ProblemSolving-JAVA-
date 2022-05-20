import java.util.Scanner;

public class BEE_1930 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T1 = in.nextInt();
		int T2 = in.nextInt();
		int T3 = in.nextInt();
		int T4 = in.nextInt();
		
		int sum = T1+T2+T3+T4;
		System.out.println(sum-3);// Explanation
		/*
		 * There are 4 power strip but 3 power strip is being used in individual power strip
		 *  So number 1 power strip is connected to the main power outlet
		 *  where other 3 power strip is being used as device
		 *  that's why 3 will be minus because they are taking 3 multiple devices like the main input device
		 */

	}

}
