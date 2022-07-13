import java.util.Scanner;

public class BEE_1028 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			int f1 = in.nextInt();//8
			int f2 = in.nextInt();//12
			int dividend;
			int divisor;
			int res;
			 if(f2 > f1){

		            dividend = f2;

		            divisor = f1;

		        }else{

		            dividend = f1;

		            divisor = f2;

		        }

		        while(dividend % divisor != 0)

		        {

		            res = dividend % divisor;//37


		            dividend = divisor;// 111
		            

		            divisor = res; // 37
		           

		        }
		        
		        System.out.println(divisor);
		       
			 
		}

	}

}
