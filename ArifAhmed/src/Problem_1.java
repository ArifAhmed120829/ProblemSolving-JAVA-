import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int x = 1 ;
		int first  = A*x*x;	
		int second  = B*x;
		int third = C;
		double sum = first + second + third ;
		
		if(sum!=Math.sqrt(3)|| sum!=Math.sqrt(5) || sum!=Math.sqrt(7) ) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
		

	}

}
