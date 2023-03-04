package LeetCode_Solving;

public class ColoredCells {

	public static void main(String[] args) {
		int num = 4;
	
		System.out.println(rec(num));
		

	}

	private static int rec(int n) {
		if(n==1) {
			return 1;
		}
		
		return (int) (Math.pow(2, n)+rec(n-1));
		
	}

}
