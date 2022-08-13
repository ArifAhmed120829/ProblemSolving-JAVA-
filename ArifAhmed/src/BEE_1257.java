import java.util.HashMap;
import java.util.Scanner;

public class BEE_1257 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();// 5
		for (int i = 0; i < test_case; i++) {
			HashMap<Character, Integer> letters2 = new HashMap<Character, Integer>();
			int map_value = 0;
			int value = 0;
			int sum = 0;
			int lines = in.nextInt();// 2
			int element_input = 0;
			for (char p = 'A'; p <= 'Z'; p++) {
				letters2.put(p, map_value);
				map_value++;
			}
			while (element_input != lines) {
				String letters = in.next();// CBA
				int len = letters.length();//3
				for (int h = 0; h < len; h++) {
					char Char = letters.charAt(h);//C
					value = letters2.get(Char)+element_input+h;//2,2,2
					sum = sum + value;
				}
				
				element_input++;
			}
			System.out.println(sum);
		}


	}

}
