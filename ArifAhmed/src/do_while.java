import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		do {
			System.out.println("Enter a number between 1 and 10: ");
			x = in.nextInt();
		}while(x<=1 || x>=10);
		
		System.out.println(x+" is between 1 and 10");
		
		

	}

}
