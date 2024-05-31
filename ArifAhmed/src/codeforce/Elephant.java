package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elephant {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine());
		int n = 5;
		int e = x/n;
		if(x%n!=0) {
			e++;
		}
		System.out.println(e);

	}

}
