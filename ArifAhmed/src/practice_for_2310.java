import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class practice_for_2310 {
	static DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {
		HashMap<Character,Integer> letters =  new HashMap<Character,Integer>();
		int value = 0;
		for(char i = 'A'; i<='Z';i++) {
			letters.put(i, value);
			value++;
		}
		System.out.println(letters);
		
	}

}
