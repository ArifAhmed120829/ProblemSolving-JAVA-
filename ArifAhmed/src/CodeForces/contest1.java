package CodeForces;

import java.util.Scanner;

public class contest1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String let = "codeforces";
		int c = 0;
		while(c!=t) {
			int count = 0;
			int z = 0;
			char ch = in.next().charAt(0);
			while(z<let.length()) {
				if(let.charAt(z) == ch) {
					count++;
				}
				z++;
			}
			if(count!=0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			c++;
			
		}

	}

}
