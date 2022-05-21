import java.util.Scanner;

public class BEE_1962 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int res = 0;
		for(int i = 0; i<N;i++) {
			int T = in.nextInt();
			res = T-2015;
			if(res>=0) {
				System.out.println(res+1+" "+"A.C.");
			}
			else if(res<0) {
				System.out.println(Math.abs(res)+" "+"D.C.");
			}
			
		}

	}

}
