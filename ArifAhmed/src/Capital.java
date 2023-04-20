
public class Capital {

	public static void main(String[] args) {
		String s = "teStString";
		int i = 0;
		System.out.println(rec(s,i));

	}

	private static char rec(String s, int i) {
		if(s.charAt(i)>=65 && s.charAt(i)<=90) {
			return s.charAt(i);
		}
		else {
			i++;
			return rec(s,i);
		}
	}

}
