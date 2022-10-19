import java.util.Scanner;

public class BEE_2702 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int chicken = in.nextInt();
		int beef = in.nextInt();
		int pasta = in.nextInt();
		int r_chicken = in.nextInt();
		int r_beef = in.nextInt();
		int r_pasta = in.nextInt();
		int passengers = 0 ;
		
		if(chicken<r_chicken) {
			passengers =passengers+(r_chicken - chicken);
		}
		if(beef<r_beef) {
			passengers = passengers+(r_beef - beef);
		}
		if(pasta<r_pasta) {
			passengers =passengers+(r_pasta - pasta);
		}
		System.out.println(passengers);

	}

}
