import java.util.Scanner;

public class BEE_2003 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//End of File Ctrl + Z
		while(in.hasNext()) {
			String n = in.next();
			char first = n.charAt(0);
			char third = n.charAt(2);
			char fourth = n.charAt(3);
			String h  = Character.toString(first);
			String sum1  = Character.toString(third);
			String sum2  = Character.toString(fourth);
			String min = sum1+sum2;
			int h1 = Integer.parseInt(h);
			int min1 = Integer.parseInt(min);
			int h2 = h1+1;//8
			h2 = h2*3600;//28800
			int min2 = min1*60; // 600
			int time2 = h2+min2;// 29400
			int time1 = 8*3600;//28800
			int res2 = 0;
			if(time2>time1) {
				res2 = time2-time1;
				res2 = res2/60;
				System.out.println("Atraso maximo: "+res2);
			}
			else {
				System.out.println("Atraso maximo: "+res2);
			}
			
			
		}

	}

}
