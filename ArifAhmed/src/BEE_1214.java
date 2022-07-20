import java.text.DecimalFormat;
import java.util.Scanner;

public class BEE_1214 {
	static DecimalFormat df = new DecimalFormat("0.000");

	public static void main(String[] args) {
		//Lol Fun fact about this problem was it took me 2 hours solve it because i used double instead of float :|
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			float res2 = 0;
			float sum = 0;
			int y = 0;
			int number_of_people = in.nextInt();
			float percentage =  (float) (100.000 / (float) number_of_people);
			int[] arr = new int[number_of_people];
			for(int j = 0; j<number_of_people; j++) {
				arr[j] = in.nextInt();
				sum = sum + arr[j];
			}
			res2 = sum / number_of_people;
			for(int x = 0; x<number_of_people; x++) {
				if(res2<arr[x]) {
					y++;
				}
			}
			float res3 = (float) y * percentage;
			System.out.println(df.format(res3)+"%");
			
		}

	}

}
