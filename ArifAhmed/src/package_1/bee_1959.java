package package_1;

import java.io.IOException;

import java.util.Scanner;

public class bee_1959 {

	public static void main(String[] args) throws IOException {
		/*
		  This image shows what you're looking for. In your case it's obviously larger numbers, but the principle stays the same.
		  Examples of limits in java are
		  Examples of limits in java are:
int: 2,147,483,648 to 2,147,483,647.
long: 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		  
		 */
		Scanner in = new Scanner(System.in);
		long N = in.nextInt(); // Number of sides
		long L = in.nextInt();// length of each side
		System.out.println(N*L);

	}

}
