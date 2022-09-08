package Java_classes;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class solve1 {
	static DecimalFormat df = new DecimalFormat("0.000");
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		int number_of_rows = in.nextInt();
		int number_of_cols = in.nextInt();
		double[][] arr = new double[number_of_rows][number_of_cols];
		double[] res = new double[number_of_rows];
		int simillar_rectangles = 0;
		for(int i = 0; i <number_of_rows; i++) {
			arr[i][0] = in.nextDouble();
			arr[i][1] = in.nextDouble();
			
			res[i] = (arr[i][0])/(arr[i][1]);
		}
		
		for(int i = 0; i<number_of_rows; i++) {
			int j = i+1;
			while(j<number_of_rows) {
				if(res[i]==res[j]) simillar_rectangles++;
				j++;
			}
		}
		System.out.println(simillar_rectangles);
		

	}

}
