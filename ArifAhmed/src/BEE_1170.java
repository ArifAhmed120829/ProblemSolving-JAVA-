import java.util.Scanner;

public class BEE_1170 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		int j = 1;
		for(int i = 0; i<test_case; i++) {
			j=1;
			float x = in.nextFloat();
			float y = x/2;
			while(y>1) {
				j++;
				y = y/2;
			}
			System.out.println(j+" dias");
		}

	}

}
