import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_1185 {
	static DecimalFormat df = new DecimalFormat("0.0");

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char s = in.next().charAt(0);
		float sum_avg = 0;
		int k = 11;
		float[][] arr = new float[12][12];
		if(s=='S') {
			for(int  i = 0; i<12; i++) {
				for(int j = 0; j<12; j++) {
					arr[i][j] = in.nextFloat();
					if(j<k) {
						sum_avg = sum_avg + arr[i][j];
					}
				}
				k--;
			}
		}
		else if(s=='M') {
			int count = 0;
			for(int  i = 0; i<12; i++) {
				for(int j = 0; j<12; j++) {
					arr[i][j] = in.nextFloat();
					if(j<k) {
						sum_avg = sum_avg + arr[i][j];
						count++;
					}
				}
				k--;
			}
			sum_avg = sum_avg/(float)count;
		}
		System.out.println(df.format(sum_avg));

	}

}
