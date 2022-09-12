import java.util.Scanner;

public class Continue_Statement {

	public static void main(String[] args) {
		//Please Enter 5 positive numbers
		//If any negative number please skip it
		// then sum all the positive numbers
		Scanner in = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i<5; i++) {
			int x = in.nextInt();
			if(x<=0) {
				continue;
			}
			sum = sum + x;
		}
		System.out.println(sum);

	}

}
