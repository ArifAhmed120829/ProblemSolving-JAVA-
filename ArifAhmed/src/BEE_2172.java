import java.util.Scanner;

public class BEE_2172 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		for(;;) {
			int x = in.nextInt();
			int y = in.nextInt();
			if(x==0 && y ==0) break;
			long res = x*y;
			System.out.println(res);
			
		}

	}

}
