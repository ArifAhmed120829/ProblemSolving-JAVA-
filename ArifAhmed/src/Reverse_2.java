import java.util.Scanner;

public class Reverse_2 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String name = in.next();
		char[] rev = new char[name.length()];
		switch(name){
			case "arif":
				System.out.println(name);
				break;
			case "faria":
				for(int i = name.length(); 0<i; i--) {
					int j = i-1;
					rev[j] = name.charAt(j);
					System.out.print(rev[j]);
				}
				break;
				
				default: System.out.println("pls type arif or faria");
				
		}

	}

}
