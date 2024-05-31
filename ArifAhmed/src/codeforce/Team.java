package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Team {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner input = new Scanner(System.in);
		int number_of_problems =input.nextInt();
		int v = 0;
		for(int i = 0; i<number_of_problems; i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			int c = input.nextInt();
			if(a+b+c>1) {
				v++;
			}
			
		}
		System.out.println(v);
		
		input.close();

	}

}
