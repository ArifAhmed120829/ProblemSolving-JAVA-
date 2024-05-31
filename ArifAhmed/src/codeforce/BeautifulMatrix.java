package codeforce;
import java.util.*;

public class BeautifulMatrix {




	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		for(int i = 0; i<5; i++) {
			for(int j = 0;j<5; j++) {
				x = in.nextInt();
				if(x==1) {
					//Intersection point(2,2)
					int c = Math.abs(j-2);//column
					int r = Math.abs(i-2);
					System.out.println(c+r);
					i= 5;
				}
			}
		}

	}




}
