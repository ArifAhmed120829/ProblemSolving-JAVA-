import java.util.Scanner;

public class BEE_1555 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			int Rafael = ((3*x)*(3*x)+y*y);
			int Beto = ((2*(x*x))+(5*y)*(5*y));
			int Carlos = (-100*x)+(y*y*y);
			if(Rafael>Beto && Rafael>Carlos) {
				System.out.println("Rafael ganhou");
			}
			else if(Rafael<Beto && Beto>Carlos) {
				System.out.println("Beto ganhou");
			}
			else if(Rafael<Carlos && Beto<Carlos) {
				System.out.println("Carlos ganhou");
			}
		}

	}

}
