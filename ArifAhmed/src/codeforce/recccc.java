package CodeForces;

public class recccc {

	public static void main(String[] args) {
		int k = 2;
		int k1 = 0;
		int a = 3;
		int z = 1;// input all numbers
		int a1 = 1;
		System.out.println(rec(a,a1,z));

	}

	private static int rec(int a,int a1,int z) {
		if(a==0) {
			return a1;
		}
		a1 = a1*z;
		return a-1;
	}

}
