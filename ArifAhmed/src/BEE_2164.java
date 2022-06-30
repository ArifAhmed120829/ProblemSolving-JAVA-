import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_2164 {
	static Scanner in = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("0.0");

	public static void main(String[] args) {
		int input = in.nextInt();
		double l = (1+Math.sqrt(5))/(2);
		double res1 = Math.pow(l, input);
		double q = (1-Math.sqrt(5))/(2);
		double res2 = Math.pow(q, input);
		double subtraction = (res1-res2);
		double division =  subtraction/(Math.sqrt(5));
		System.out.println(df.format(division));

	}

}
