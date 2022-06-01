import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_1985 {
	private static final DecimalFormat df = new DecimalFormat("0.00"); 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number_purchased = in.nextInt();
		double sum = 0;
		double[] arr;
		arr = new double[number_purchased];
		for(int i = 0; i < number_purchased; i++) {
			int product_number = in.nextInt();
			int quantity = in.nextInt();
			if(product_number == 1001) {
				sum  = quantity*1.50;
			}
			else if(product_number == 1002) {
				sum  = quantity*2.50;
			}
			else if(product_number == 1003) {
				sum  = quantity*3.50;
			}
			else if(product_number == 1004) {
				sum  = quantity*4.50;
			}
			else if(product_number == 1005) {
				sum  = quantity*5.50;
			}
			arr[i] = sum;
			
		}
		sum = 0;
		for(int i  = 0 ; i < number_purchased; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(df.format(sum));

	}

}
