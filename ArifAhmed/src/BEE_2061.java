import java.util.Scanner;

public class BEE_2061 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int total_tabs = in.nextInt();
		int total_action = in.nextInt();
		int multi = 2;
		int f = 0;
		int c = 0;
		for(int i = 0; i < total_action; i++) {
			String name = in.next();
			switch(name) {
			case "fechou":
				f++;
				break;
			case "clicou":
				c++;
				break;
			}
			
		}
		int res = total_tabs - f + (f*multi);
		res = res - c;
		System.out.println(res);

	}

}
