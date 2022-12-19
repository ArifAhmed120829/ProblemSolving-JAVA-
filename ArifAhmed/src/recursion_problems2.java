
public class recursion_problems2 {

	public static void main(String[] args) {
		int fibo = 12;
		System.out.println(fib(fibo));

	}

	private static int fib(int fn) {
		int res;
		if(fn==0) return 0;
		res = fib(fn-1)+fn;
		System.out.println(res);
		return res;
	}

}
