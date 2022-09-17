package Java_classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two_Elevators {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(in.readLine());
		for(int i = 0; i<test_case; i++) {
			String[] lines = in.readLine().split(" ");
			int a = Integer.parseInt(lines[0]);
			int b = Integer.parseInt(lines[1]);
			int c = Integer.parseInt(lines[2]);
			int sec1 = a-1;
			int sec2 = 0;
			if(c>b) {
				sec2 = (c-b)+(c-1);
			}
			else if(c<b) {
				sec2 = b-1;
			}
			else if(b==1) {
				sec2 = (c-b)+(c-1);
			}
			if(sec1<sec2) {
				System.out.println(1);
			}
			else if(sec1>sec2) {
				System.out.println(2);
			}
			else {
				System.out.println(3);
			}
			
		}

	}

}
