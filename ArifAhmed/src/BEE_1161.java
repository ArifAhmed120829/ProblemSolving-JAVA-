import java.util.Scanner;

public class BEE_1161 {
	static Scanner in = new Scanner(System.in);
	

	public static void main(String[] args) {
		while(in.hasNext()) {
			long M = in.nextInt();//4
			long N = in.nextInt();//4
			//4! = 4*3*2*1
			long res1 =1;
			//4! = 4*3*2*1
			long res2 = 1;
			for(long i =M; i>= 1; i--) {// i = 4; 4>= 1; 4--;
				res1 = res1*i;//1*4;4*3,12*2;
			}
			for(long i = N; i>=1; i--) {
				res2 = res2*i;
			}
			long sum = res1+res2;
			System.out.println(sum);
			
		}
		
	}

}
