import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lets_Review {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		String even;
		String odd;
		char f;
		String character;
		for(int i = 0; i<T; i++) {
			even = "";
			odd = "";
			String S = in.readLine();
			int length = S.length();
			for(int j = 0; j<length; j++) {
				if(j%2==0) {
					 f = S.charAt(j);
					character = String.valueOf(f);
					even = even + character;
				}
				else {
					 f = S.charAt(j);
						character = String.valueOf(f);
						odd = odd + character;
				}
			}
			System.out.println(even+" "+odd);
		}

	}

}
