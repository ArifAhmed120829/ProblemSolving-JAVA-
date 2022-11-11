
public class trying {

	public static void main(String[] args) {
		String someString = "123122";
		boolean isNumeric = someString.chars().allMatch( Character::isDigit );
		System.out.println(isNumeric);

	}

}
