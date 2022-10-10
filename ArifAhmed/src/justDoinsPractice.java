
public class justDoinsPractice {

	public static void main(String[] args) {
		String name = "Arif";
		System.out.println(reverse(name));

	}

	private static String reverse(String name) {
		String result;
		if(name.length()==1) return name;
		result = reverse(name.substring(1))+name.charAt(0);
		return result;
	}

}
