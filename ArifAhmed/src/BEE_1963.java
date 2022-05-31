import java.util.Scanner;

public class BEE_1963 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double A = in.nextDouble();
		double B = in.nextDouble();
		double R = (B-A);
		double r = R/A;
		r = r*100;
		String s = String.format("%.2f", r);
		
		System.out.println(s+"%");

	}

}
