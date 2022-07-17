import java.util.Scanner;

public class BEE_1240 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int  i =0 ; i<N; i++) {
			int A = in.nextInt();
			int B = in.nextInt();
			String res="";
			String A1 = String.valueOf(A);
			int length_of_A = A1.length();
			String B1 = String.valueOf(B);
			int length_of_B = B1.length();
			if(A==B) {
				System.out.println("encaixa");
			}
			else if(length_of_A>=length_of_B) {
				for(int j =length_of_A-1; j>length_of_B;j-- ) {
					char g = A1.charAt(j);
					res = res + g;
				}
				System.out.println(res);
				
			}
			
		}

	}

}
