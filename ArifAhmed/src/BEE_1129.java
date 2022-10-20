import java.util.Scanner;

public class BEE_1129 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (true) {
			int test_case = in.nextInt();

			String x = "";
			if (test_case == 0)
				break;
			for (int i = 0; i < test_case; i++) {
				int A = in.nextInt();// 0
				int B = in.nextInt();// 255
				int C = in.nextInt();// 255
				int D = in.nextInt();// 255
				int E = in.nextInt();// 255
				String x1 = (A <= 127) ? "A" : x + " ";
				String x2 = (B <= 127) ? "B" : x + " ";
				String x3 = (C <= 127) ? "C" : x + " ";
				String x4 = (D <= 127) ? "D" : x + " ";
				String x5 = (E <= 127) ? "E" : x + " ";

				if (x1.equals("A") && !x2.equals("B") && !x3.equals("C")
						&& !x4.equals("D") && !x5.equals("E")) {
					System.out.println(x1);
				}
				else if (!x1.equals("A") && x2.equals("B") && !x3.equals("C")
						&& !x4.equals("D") && !x5.equals("E")) {
					System.out.println(x2);
				}
				else if (!x1.equals("A") && !x2.equals("B") && x3.equals("C")
						&& !x4.equals("D") && !x5.equals("E")) {
					System.out.println(x3);
				}
				else if (!x1.equals("A") && !x2.equals("B") && !x3.equals("C")
						&& x4.equals("D") && !x5.equals("E")) {
					System.out.println(x4);
				}
				else if (!x1.equals("A") && !x2.equals("B") && !x3.equals("C")
						&& !x4.equals("D") && x5.equals("E")) {
					System.out.println(x5);
				}
				else {
					System.out.println("*");
				}

			}
		}

	}

}
