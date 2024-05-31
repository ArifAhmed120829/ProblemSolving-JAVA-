package codeforce;
import java.util.*;

public class Bitplus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		int x = 0;
		for(int i = 0; i<test_case; i++) {
			//Start your code from here**
			String s = in.next();
			if(s.charAt(1) == '+') ++x;
			else --x;
			
		}
		System.out.println(x);

	}

}
