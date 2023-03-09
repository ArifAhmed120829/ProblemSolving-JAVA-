
public class natural_numbers_rec {
//first 50 natural numbers using recursion
	public static void main(String[] args) {
		int n = 1;
		System.out.println(rec(n));

	}

private static boolean rec(int n) {
	long pow = 3;
	if(n<3 && n!=1) return false;
	if(n==1) return true;
	while(pow<=n) {
		if(pow==n) {
			return true;
		}
		pow = pow * 3;
	}
	return false;
}

}
