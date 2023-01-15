import java.util.Scanner;

public class okkhor_gonona {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			String sen = in.next();
			int len = sen.length();
			int[] c = new int[26];
			char[] arr = new char[len];
			for(int j = 0; j<len; j++) {
				arr[j] = sen.charAt(j);
			}
			for(int j = 0; j<len; j++) {
				if(arr[j] >= 'a' && arr[j] <= 'z') {
					c[arr[j] - 'a']++;
				}
			}
			for(int j = 0; j< 26; j++) {
				if(c[j] != 0) {
					System.out.println((char)('a'+j)+" "+c[j]);
				}
			}
		}

	}

}
