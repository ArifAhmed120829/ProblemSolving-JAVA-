import java.util.Scanner;

public class Checking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		int age;
		String name;
		name = in.next();
		age = in.nextInt();
		if(name.equals("Arif")) System.out.println("Hi arif");
		if(age<18) {
			System.out.println("You are a boy");
		}
		else {
			System.out.println("You are a man");
		}
		System.out.println("End");
		

	}

}
