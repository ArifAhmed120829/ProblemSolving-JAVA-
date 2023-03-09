
public class fibonacci_series {

	public static void main(String[] args) {
		//fibonacci
		int n = 10;
		System.out.println(series(n));

	}

	private static int series(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		int res = series(n-1)+series(n-2);
		return res;
	}

}
