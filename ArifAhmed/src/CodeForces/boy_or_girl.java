package codeforce;
import java.util.Scanner;
import java.util.HashSet;

public class boy_or_girl {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name = in.next();
		
		int length = count(name);
		System.out.println(maleorfemale(length));
		

	}

	private static String maleorfemale(int length) {
		String a = "CHAT WITH HER!";
		String b = "IGNORE HIM!";
		String result = (length %2 == 0) ?  a: b;
		return result;
		
		
		
	}

	private static int count(String name) {
		
		char[] charArray = name.toCharArray();
		HashSet<Character> uniqueCh = new HashSet<>();
		for(char v:charArray) {
			uniqueCh.add(v);
			
		}
		return uniqueCh.size();
	}

}
