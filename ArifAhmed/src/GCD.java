
public class GCD {

	public static void main(String[] args) {
		int a,b;
		a = 10;
		b = 50;
		System.out.println(gcd(a,b));
	}

	private static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		int temp = b;
		b= a%b;
		a = temp;
		return gcd(a,b);
		
	}

}
