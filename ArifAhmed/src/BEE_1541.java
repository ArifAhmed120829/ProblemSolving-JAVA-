import java.util.Scanner;

public class BEE_1541 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		while(in.hasNext()) {
			int A = in.nextInt();
			if(A==0) break;
			int B = in.nextInt();
			int C = in.nextInt();
			
			int area1 = A*B*100;
			int area_of_recratngle = area1/C;
			int area2 = (int) Math.sqrt(area_of_recratngle);
			System.out.println(area2);
		}

	}

}
