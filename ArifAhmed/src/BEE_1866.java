import java.util.Scanner;

public class BEE_1866 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int C= in.nextInt();
		for(int i = 0; i < C ; i++) {
			int N = in.nextInt();
			if(N%2==0) {
				System.out.println(0);
			}
			else {
				System.out.println(1);
			}
			
		}

	}

}
