
public class reverse_string {

	public static void main(String[] args) {
		String n = "w3resource";
		int l = n.length() - 1;
		String n2 = "";
		rev(n, l, n2);

	}

	private static void rev(String n, int l, String n2) {
		if (l < 0) {
			System.out.println(n2);
			return;
		}
		char s = n.charAt(l);
		n2 = n2 + s;
		rev(n, l - 1, n2);

	}
}
