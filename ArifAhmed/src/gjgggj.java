import java.util.Scanner;

public class gjgggj {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i<test_case; i++) {
			int f1 = in.nextInt();//8
			int f2 = in.nextInt();//12
			int dividend;
			int divisor;
			int res;
			int s = 259;
			int u = 111;
			if(s%u==0) {
				System.out.println("fuck");
			}
			 if(f2 > f1){

		            dividend = f2;

		            divisor = f1;

		        }else{

		            dividend = f1;

		            divisor = f2;

		        }

		        while(dividend % divisor != 0)

		        {

		            res = dividend % divisor;//2
		            System.out.println(res);

		            dividend = divisor;// 111
		            System.out.println(dividend);

		            divisor = res; // 2
		            System.out.println(divisor);

		        }
		        
		        System.out.println(divisor);
		       
			 
		}

	}

}
