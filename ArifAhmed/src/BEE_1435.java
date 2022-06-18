import java.util.Scanner;

public class BEE_1435 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while(in.hasNext()) {
			int x = in.nextInt();
			int j = 1;
			if(x==0) break;
			for(int i = 0; i<x; i++) {
				System.out.print(j+" ");
				for(int y = 1; y<x; y++) {
					System.out.print(j);
					if(y!=x-1) {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		

	}

}
