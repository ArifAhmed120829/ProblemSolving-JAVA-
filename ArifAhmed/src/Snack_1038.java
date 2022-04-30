import java.util.Scanner;

public class Snack_1038 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X,Y;
		double res = 0;
		X = in.nextInt();
		Y = in.nextInt();
		if(X==1) res = Y*4.00;
		else if(X==2) res = Y*4.50;
		else if(X==3) res = Y*5.00;
		else if(X==4) res = Y*2.00;
		else if(X==5) res = Y*1.50;
		String res2 = String.format("%.2f", res);
		System.out.println("Total: R$ "+res2);
}
}
