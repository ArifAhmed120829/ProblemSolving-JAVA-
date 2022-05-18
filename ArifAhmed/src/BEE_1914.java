import java.util.Scanner;

public class BEE_1914 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int QT = in.nextInt();
		for(int i = 0; i< QT; i++) {
			String Player_1 = in.next();
			String choice = in.next();
			String Player_2 = in.next();
			String choice2 = in.next();
			int N = in.nextInt();
			int M = in.nextInt();
			int sum = N+M;
			if(sum%2==0) {
				if(choice.equals("PAR")) {
					System.out.println(Player_1);
				}
				else {
					System.out.println(Player_2);
				}
				
			}
			else if(sum%2==1) {
				if(choice.equals("IMPAR")) {
					System.out.println(Player_1);
				}
				else {
					System.out.println(Player_2);
				}
			}
			
			
		}
		

	}

}
