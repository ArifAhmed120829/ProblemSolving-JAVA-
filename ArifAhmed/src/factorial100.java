
public class factorial100 {

	public static void main(String[] args) {
		long fact  = 10;
		System.out.println(f(fact));
		long number = f(fact);
		long mod,zero_count = 0;
		while(number>0) {
			mod = number % 10;
			if(mod == 0) zero_count++;
			else break;
			number = number /10;
		}
		System.out.println(zero_count);
		

	}

	private static long f(long fact) {
		if(fact == 0) return 1;
		return f(fact-1)*fact;
	}

}
