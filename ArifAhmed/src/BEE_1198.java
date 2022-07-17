import java.util.Scanner;

public class BEE_1198 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while(in.hasNext()) {
			int x = in.nextInt();
			int y = in.nextInt();
			int z;
			if(x>y) {
				z = x-y;
			}
			else {
				z = y-x;
			}
			System.out.println(z);
		}
		
		

	}

}
