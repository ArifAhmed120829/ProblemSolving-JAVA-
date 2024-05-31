package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int weights = Integer.parseInt(in.readLine());
		if(weights>2) {
			if(weights %2 ==0) System.out.println("YES");
			else System.out.println("NO");
		}
		else {
			 System.out.println("NO");
		}
		
		
	}
	
	

}
