import java.util.Scanner;

public class BEE_1221 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();//3
		for(int i = 0; i<test_case; i++) {
			int y = 0;
			long x = in.nextInt();
			for(long j = 2; j<=x-1;j++) {//j<3-1, 2<=2
				if(x%j==0) {
					System.out.println("Not Prime");
					j=x;
					y++;
				}
				
				
			}
			if(y==0) System.out.println("Prime");
			
		}

	}

}
