import java.util.Scanner;

public class practicing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test = in.nextInt();
		for(int i = 0; i<test; i++) {
			in.nextLine();
			String l = in.nextLine();
			char let = in.next().charAt(0);
			int j = 0;
			int res = 0;
			while(j<l.length()) {
				if(l.charAt(j) == let) res++;
				//System.out.println(j);
				j++;
				
			}
			System.out.println(res);
		}
	}

}
