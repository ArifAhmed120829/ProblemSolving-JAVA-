import java.util.Scanner;

public class BEE_2540 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			double sum = 0;
			int t = in.nextInt();
			for(int i = 0; i<t; i++) {
				int  x = in.nextInt();
				sum = sum + x;
				
			}
			double num = (double) 2 /  (double) 3;
			double res = (num) * t;
			
			if(res>sum) {
				System.out.println("acusacao arquivada");
			}
			else {
				System.out.println("impeachment");
			}
		}

	}

}
