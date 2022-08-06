import java.util.Scanner;

public class BEE_1024 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		in.nextLine();
		for(int i = 0; i<test_case;i++) {
			String text = in.nextLine();
			int len = text.length();
			String blank ="";
			for(int j = 0; j<len; j++) {
				char character = text.charAt(j);
				if(Character.isLetter(character)) {
					int charnumber = Integer.valueOf(character);
					charnumber = charnumber + 3;
					char newcharacter = Character.valueOf((char) charnumber);
					blank = blank + newcharacter;
				}
				else {
					blank = blank + character;
				}
			}
			//1st part done this will result a->d
			
			String newblank = "";
			for(int c = blank.length()-1; c>=0; c--) {
				char rev = blank.charAt(c);
				newblank = newblank + rev;
			}
			
			//2nd part done
			
			int len2 = newblank.length();
			int half = 0;
			if(len2%2==0) {
				half = (len2/2)+1;
			}
			else {
				half = (len2/2)+1;
			}
			
			String finalblank = "";
			for(int u = 0; u<half-1; u++) {
				char first_half = newblank.charAt(u);
				finalblank = finalblank+first_half;
			}
			for(int z = half-1; z<len2; z++) {
				char sec_half = newblank.charAt(z);//4->
				sec_half = (char) (sec_half-1);
				finalblank = finalblank+sec_half;
			}
			System.out.println(finalblank);
			//3rd part done
			//Finished
		}

	}

}
