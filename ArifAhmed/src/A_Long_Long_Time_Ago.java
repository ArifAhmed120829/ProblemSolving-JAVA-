import java.util.Scanner;

public class A_Long_Long_Time_Ago {
	final static int roll = 103;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println(roll);
		System.out.println(roll2());
		A_Long_Long_Time_Ago a  = new A_Long_Long_Time_Ago();
		a.hn();
		int test_case = in.nextInt();
		for(int i = 0; i< test_case; i++) {
			System.out.println("This is the main loop");
			for(int j = i+1; j <test_case; j++) {
				System.out.println("This is the inner loop");
			}
		}
		/*
		 * this loop will run 3 times
		 * In First time The main loop will print once  while the inner loop will print twice  because in inner loop j = 0+1, j = 1, j = 1,2;
		 * In Second time The main loop will print once  and the inner loop will print once  because in inner loop j = 1+1, j = 2, j = 2;
		 * In Third time The main loop will print once  while the inner loop will print nothing  because in inner loop j = 2+1, j = 3, j = 0 cause j>test_case;
		 */
		in.close();
		

	}
	private void hn(){
		System.out.println("Jesus Nigga");
	}
	private static int roll2() {
		return roll*roll;
	}
	
	

}
