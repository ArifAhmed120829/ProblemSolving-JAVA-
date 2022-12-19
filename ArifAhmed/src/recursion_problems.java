
public class recursion_problems {

	public static void main(String[] args) {
		//create factorial using recursion
		int fact = 7;
		System.out.println(rec(fact));

	}
	static long rec(int f) {
		long res;
		if(f==0) return 1;
		res = rec(f-1) * f;//return 1; return rec(1) * 2 return rec(2) * 3 return rec(3) * 4 return rec(4) * 5 return rec(5) * 6  * return rec(6) * 7
		//1
		//2
		//6
		//24
		//120
		//720
		//5040
		return res;
	}

}
