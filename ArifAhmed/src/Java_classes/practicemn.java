package Java_classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practicemn {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] space = new String[2];
		int first_int;
		String sec_st;
		space = in.readLine().split(" ");
		first_int = Integer.parseInt(space[0]);
		sec_st = space[1];
		System.out.println(first_int+" "+sec_st);

	}

}
