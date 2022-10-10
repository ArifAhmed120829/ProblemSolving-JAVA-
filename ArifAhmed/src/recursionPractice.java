
public class recursionPractice {
	// Write a program to reverse String in Java using Recursion


	public static void main(String[] args) {
		String name = "Saggin";
		System.out.println(reverse(name));
		String name2 = "S";
		System.out.println(name2.substring(1)+name2.charAt(0));
		

	}

	private static String reverse(String name) {
		if(name.length()==1) {
			return name;
		}
		return reverse(name.substring(1))+name.charAt(0);
		
	}
	
}
