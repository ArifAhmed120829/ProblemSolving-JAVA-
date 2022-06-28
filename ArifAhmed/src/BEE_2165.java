import java.util.Scanner;

public class BEE_2165 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String text_line = in.nextLine();
		int length = text_line.length();
		if(length>140) {
			System.out.println("MUTE");
		}
		else {
			System.out.println("TWEET");
		}
	}

}
