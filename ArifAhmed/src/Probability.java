import java.util.ArrayList;
import java.util.Scanner;

public class Probability {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String sentence = in.nextLine();
		int count = 1;
		String word = "";
		int alike = 1;
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i<sentence.length(); i++) {
			if(sentence.charAt(i) == ' ') {
				count++;
			}
		}
		for(int i = 0; i<sentence.length(); i++) {
			
			if(sentence.charAt(i) == ' ') {
				list.add(word);
				word = "";
			}
			else {
				word = word + sentence.charAt(i);
			}
			
		}
		list.add(word);
		for(int i = 0; i<count;i++) {
			for(int j = 1;j<count; j++) {
				if(i!=j) {
					if(list.get(i).equals(list.get(j))) {
						alike++;
					}
				}
			}
		}
		int res = f(count)/alike;
		System.out.println(1+"/"+res);
		
	}

	private static int f(int count) {
		if(count==0) return 1;
		
		return f(count-1) * count;
	}

}
