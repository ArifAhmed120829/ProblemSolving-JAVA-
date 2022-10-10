import java.util.Scanner;

public class BEE_1029 {
	static int counter  = 0;
	static int calls  = 0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			int x = in.nextInt();
			System.out.println("fib("+x+") = "+fib(x)+" calls = "+calls);
			counter = 0;
			calls = 0;	
		}
	}

	private static int fib(int x) {
		int result;
		int result2;
		if(x-1>=1) counter++;
		if(x-2>=0) counter++;
		if(x-1==1) calls++;
		if(x-2==1) calls++;
		if(x-2<=0) {
			return counter;
		}
		result = fib(x-1);
		counter = 0;
		result2 = fib(x-2);
	
		return result+result2;
		
		
	}
}
