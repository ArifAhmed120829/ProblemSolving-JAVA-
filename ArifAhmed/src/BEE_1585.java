import java.util.Scanner;

public class BEE_1585 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i< test_case; i++) {
			int base = in.nextInt();
			int height = in.nextInt();
			int area = (base*height)/2;
			System.out.println(area+" cm2");
			
		}
		
		/*
		 * char c ='1';
		int r = Character.getNumericValue(c);
		System.out.println(r+1);
		Wrapper Class
		********
		int j = 100;
		Integer k = Integer.valueOf(j);
		System.out.println(j+" "+k);
		*********
		*/
		

	}

}
