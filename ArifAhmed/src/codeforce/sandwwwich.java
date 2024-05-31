package codeforce;
import java.util.Scanner;


public class sandwwwich {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0; i<t; i++) {
			int b = in.nextInt();
			int c = in.nextInt();
			int h = in.nextInt();
			
			int max = 1;
			while(b>1 && (c >0 || h > 0)) {
				max++;//2,3
				b--;//1
				if(c>0) {
					c--;//0
					max++;
				}
				else if(h >0) {
					h--;//0
					max++;
				}
			}
			System.out.println(max);
			
		}

	}

}
