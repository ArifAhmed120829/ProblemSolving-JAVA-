import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_2147 {
	static Scanner in = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		int C = in.nextInt();
		for(int i = 0; i<C; i++) {
			String name = in.next();
			double res =  name.length();
			res = res /100;
			System.out.println(df.format(res));
		}
		

	}

}
