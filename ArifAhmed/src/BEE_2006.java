import java.util.Scanner;

public class BEE_2006 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();// Tea Type
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		int D = in.nextInt();
		int E = in.nextInt();
		int i = 0;
		if(A==T) i++;
		if(B==T) i++;
		if(C==T) i++;
		if(D==T) i++;
		if(E==T) i++;
		System.out.println(i);

	}

}
