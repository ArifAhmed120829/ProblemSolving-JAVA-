import java.util.Scanner;

public class BEE_2160 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String text_line = in.nextLine();	
		System.out.println(text_line.length());
		int i = 0;
		if(text_line.length()<81) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
