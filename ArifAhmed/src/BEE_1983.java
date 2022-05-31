import java.util.Scanner;

public class BEE_1983 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		double[] arr;
		int[] arr2;
		double max = 0;
		int reg = 0;
		
		arr = new double[number];
		arr2 = new int[number];
		for( int i = 0; i< number; i++) {
			int reg_number = in.nextInt();
			double max_score = in.nextDouble();
			arr[i] = max_score;
			arr2[i] = reg_number;
		}
		int i = 0;
			max = arr[i];
			for(int j = 1; j<number; j++) {
				if(max>arr[j]) {//9.8 0 9.9 10 9.5 9.6 9.4 8.2 8.3 7.4
					reg = arr2[i];
					max = arr[i];
				}
				else {
					max = arr[j];
					reg = arr2[j];
					i=j;
					
				}
			}
		
		
		if(max<8) {
			System.out.println("Minimum note not reached");
		}
		else {
			System.out.println(reg);
		}
		
		

	}

}
