import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_2029 {
	static Scanner in = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		while(in.hasNext()) {
			double v = in.nextDouble();
			double d = in.nextDouble();
			double height = v/((3.14*d*d)/4);
			double area = (3.14*d*d)/4;
			
			System.out.println("ALTURA = "+df.format(height));
			System.out.println("AREA = "+df.format(area));
		}

	}

}
