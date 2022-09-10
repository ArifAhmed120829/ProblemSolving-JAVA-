import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE_2483 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String phrase = "Feliz natal";
		String result = "";
		int len = phrase.length();//11
		char a;
		for(int x = 0; x<len-1; x++) {
			a = phrase.charAt(x);
			result = result+a;
		}
		int happiness = Integer.parseInt(in.readLine());
		for(int i = 1; i<happiness; i++) {
			result = result + "a";
		}
		System.out.println(result+"l!");

	}

}
