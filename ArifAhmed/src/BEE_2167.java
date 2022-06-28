import java.util.Scanner;

public class BEE_2167 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int test_case = in.nextInt();
		int[] number = new int[test_case];
		int k = 0;
		int u = 1;
		for(int i = 0; i<test_case; i++) {
			 number[i] = in.nextInt();
		}
		for(int j = 1; j<test_case; j++) {
			if(number[j]>=number[k]) {
				k = j;
				u++;
			}
			else {
				j = test_case;
			}
			
		}
		if(u==test_case) {
			u = 0;
			System.out.println(u);
		}
		else {
			System.out.println(u+1);
		}
	
		
	}

}
