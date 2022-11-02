import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_2533 {
	static DecimalFormat df = new DecimalFormat("0.0000");
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int test_case = in.nextInt();// The number of subjects
			int sum_of_product = 0;
			int total_ci = 0;
			for(int i = 0; i<test_case; i++) {
				int ni = in.nextInt();//the grade
				int ci = in.nextInt();//its workload
				sum_of_product = sum_of_product + (ni*ci);
				total_ci = total_ci + ci;
			}
			total_ci = total_ci * 100;
			double API = (double)sum_of_product/(double)total_ci;
			System.out.println(df.format(API));
		}

	}

}
