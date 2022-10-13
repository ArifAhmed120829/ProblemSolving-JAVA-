import java.util.Scanner;

public class BEE_2523 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    while(in.hasNext()) {
	      String s = in.next();
	      String result = "";
	      char a[] = new char[26];
	      int number = in.nextInt();
	      for(int j = 0; j<number; j++) {
	        int x = in.nextInt();
	        a[j] = s.charAt(x-1);
	      }
	      for(char value: a ) {
	        result = result + value;
	      }
	      System.out.println(result);
	    }

	}

}
