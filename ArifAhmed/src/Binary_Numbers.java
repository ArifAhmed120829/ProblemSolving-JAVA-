import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Binary_Numbers {
	static int number = 0;
	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
	      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());//125
	        divide(n);
	        System.out.println(Collections.max(list));

	        bufferedReader.close();

	}

	private static int divide(int n) {
		int result;
		if(n/2==0) {
			if(n%2==1) {
				number++;
			}
			list.add(number);
			return n%2;
			
		}
		else if(n%2==1) number++;
		else if(n%2==0) {
			list.add(number);
			number = 0;
		}
		result = divide(n/2);
		return result;
		
	}

}
