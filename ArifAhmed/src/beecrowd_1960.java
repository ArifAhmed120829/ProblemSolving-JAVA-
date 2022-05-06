import java.util.Scanner;

public class beecrowd_1960 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N= in.nextInt();
		int res1,res2=0,res3,res4,res5,res6,res7,res8,res9,res10;
		if(N<=999) {
			/*
			if(N==1) System.out.println("I");
			if(N==5) System.out.println("V");
			if(N==10) System.out.println("X");
			if(N==50) System.out.println("L");
			if(N==100) System.out.println("C");
			if(N==500) System.out.println("D");
			if(N==1000) System.out.println("M");
			*/
			if(N/900!=0) {
				res1 = N/900;
				res2 = N%900;
				for(int i = 0; i<res1; i++) {
					System.out.print("CM");
				}
			}
			if(res2/500!=0) {
				res1 = res2/500;
				res2 = N%900;
				for(int i = 0; i<res1; i++) {
					System.out.print("CM");
					System.out.println(res2);
				}
			}
			
			
		}

	}

}
