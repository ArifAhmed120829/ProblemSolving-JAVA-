
public class oPtimizecode {

	public static void main(String[] args) {
		/*
		 * for(int i = 0; i<test_case;i++) {
			String text = in.nextLine();
			int len = text.length();
			char[] acots = new char[len];
			for(int j = 0; j<len; j++) {
				char character = text.charAt(j);
				if(character==' ') {
					blank = blank + character;
				}
				else if(Character.isDigit(character)) {
					blank = blank + character;
				}
				else if(Character.isLetter(character)) {
					int charnumber = Integer.valueOf(character);
					charnumber = charnumber + 3;
					char newcharacter = Character.valueOf((char) charnumber);
					blank = blank + newcharacter;
				}
				else {
					blank = blank + character;
				}
			}
			//1st loop done this will result a->d
		 */
		String name = "Dog";
		String name2 = "";
		for(int x = name.length()-1; x>=0; x--) {
			char ab = name.charAt(x);
			name2 = name2+ab;
		}
		System.out.println(name2);

	}

}
