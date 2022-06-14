import java.util.Scanner;

public class BEE_1848 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		//During the dream, the crow blinks many times and screams exactly 3 times. Every scream corresponds to a result.
		int sum = 0; // result
		int i = 0;// caw caw 
		while(i!=3) {
			String ab  = in.nextLine();
			if(ab.equals("caw caw")) {
				System.out.println(sum);
		          i++;
		          sum = 0;
		          
		          
		        }
			else {
		         
		          char first = ab.charAt(0);
		          char sec = ab.charAt(1);
		          char third = ab.charAt(2);
		          if(first=='-') {
		        	  
		            sum = sum + 0;
		          }
		          if(sec=='-') {
		            sum = sum + 0;
		          }
		          if(third=='-') {
		            sum = sum + 0;
		          }
		          if(first == '*') {
		            sum = sum + 4;
		           
		          }
		          if(sec == '*') {
		            sum = sum + 2;
		          }
		          if(third == '*') {
		            sum = sum + 1;
		          }
		          
		          
		        }
			
		}
	}

}
