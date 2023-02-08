package LeetCode_Solving;

public class power_of_two {

	public static void main(String[] args) {
		int n= 2147483646;
		long z = 1;
		System.out.println(rec(n,z));

	}

	private static boolean rec(int n,long z) {
		if(z==n) {
			return true;
		}
		if(z>n || n%2==1) {
			return false;
		}
		z = z*2;
		return rec(n,z) ;
		
	}

}
