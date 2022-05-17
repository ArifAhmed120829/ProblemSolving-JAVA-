import java.util.Scanner;

public class BEE_1865 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int C= in.nextInt();
		for(int i = 0; i <C; i++) {
			String word = in.next();
			int N = in.nextInt();
			if(word.equals("Thor")) {
				System.out.println("Y");
			}
			else {
				System.out.println("N");
			}
			
		}

	}

}
