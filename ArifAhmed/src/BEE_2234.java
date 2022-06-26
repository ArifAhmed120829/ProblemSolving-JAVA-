import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_2234 {
	static Scanner in = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		double n = in.nextInt();
		double p = in.nextInt();
		double average = (n/p);
		
		System.out.println(df.format(average));
		
		

	}

}
