import java.util.Scanner;

public class BEE_1933 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = 0;
		if(A==B) {
			C=A;
		}
		else if(A>B) {
			C=A;
		}
		else if(B>A) {
			C=B;
		}
		System.out.println(C);

	}

}
