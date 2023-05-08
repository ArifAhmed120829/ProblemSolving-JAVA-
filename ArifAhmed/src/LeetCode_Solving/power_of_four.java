package LeetCode_Solving;

public class power_of_four {

	public static void main(String[] args) {
		int n = 0;
		System.out.println(rec(n));

	}

	private static boolean rec(int n) {
		if(n==1) {
			return true;
		}
		else if(n%4 != 0 || n == 0) {
			return false;
		}
		
		return rec(n/4);
		
	}

}
