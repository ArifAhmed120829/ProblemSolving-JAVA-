import java.util.Scanner;

public class BEE_1585 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i< test_case; i++) {
			int base = in.nextInt();
			int height = in.nextInt();
			int area = (base*height)/2;
			System.out.println(area+" cm2");
			
		}

	}

}
