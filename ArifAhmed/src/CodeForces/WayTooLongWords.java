package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(in.readLine().trim());
		String result;
		String s;
		for(int i = 0; i<test_case; i++) {
			String word = in.readLine();
			int length = word.length();
			s = String.valueOf(length-2);
			result = "";
			char first_letter = word.charAt(0);
			char last_letter = word.charAt(length-1);
			if(length>10) {
				result = first_letter+s+last_letter;
			}
			else {
				result = word;
			}
			System.out.println(result);
		}

	}

}
