
public class sum_of_numbers {

	public static void main(String[] args) {
		// sum of 1 to n numbers
		int n = 10;
		System.out.println(sum(n));

	}

	private static int sum(int n) {
		if(n==0) return 0;
		return n+sum(n-1);
		
		
	}

}
