package codeforce;

import java.util.*;

public class PetyaStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		s1 = s1.toLowerCase();
		String s2 = in.next();
		s2 = s2.toLowerCase();
		System.out.println(compare(s1,s2));

	}

	private static int compare(String s1, String s2) {
		int result = s1.compareTo(s2);
		if(result < 0)  return -1;
		else if(result>0) return 1;
		else return 0;
	}

}
