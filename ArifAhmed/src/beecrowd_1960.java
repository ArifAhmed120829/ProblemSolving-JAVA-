import java.util.Scanner;

public class beecrowd_1960 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N= in.nextInt();
		res(N);
	}
	public static void res(int n) {
		int res1=0;
		if(n<=999) {
			/*
			if(N==1) System.out.println("I");
			if(N==5) System.out.println("V");
			if(N==10) System.out.println("X");
			if(N==50) System.out.println("L");
			if(N==100) System.out.println("C");
			if(N==500) System.out.println("D");
			if(N==1000) System.out.println("M");
			*/
			// N == 999
			if(n/900!=0) {
				res1 = n%900;// 666%500 = 166
				n = n/900;  // N = 1
				for(int i = 0; i<n; i++) {
					System.out.print("CM");
				}
				res2(res1);
				n=0;
					
			}
			if(n/500!=0) {
				res1 = n%500;// 666%500 = 166
				n = n/500;  // N = 1
				for(int i = 0; i<n; i++) {
					System.out.print("D");
				}
				if(res1/100!=0) {
					int l = res1/100;
					 res1 = res1%100;
					for(int i = 0; i<l; i++) {
						System.out.print("C");
					}
				}
				res2(res1);
				n = 0;
	
			}
			if(n/400!=0) {
				res1 = n%400;// 99
				n = n/400;  // 1
				for(int i = 0; i<n; i++) {
					System.out.print("CD");
				}
				res2(res1);
				n=0;
					
			}
			if(n/100!=0) {
				res1 = n%100;// 399/100 = 99
				n = n/100;  // 3
				for(int i = 0; i<n; i++) {
					System.out.print("C");
				}
				
				res2(res1);
				n=0;
			
	
			}
			if(n/90!=0) {
				res1 = n%90;
				n = n/90;  
				for(int i = 0; i<n; i++) {
					System.out.print("XC");
				}
				
				res2(res1);
				n =0;
			
	
			}
			if(n/50!=0) {
				res1 = n%50;
				n = n/50;  
				for(int i = 0; i<n; i++) {
					System.out.print("L");
				}
				
				res2(res1);
				n =0;
			
	
			}
			if(n/10!=0) {
				res1 = n%10;
				n = n/10;  
				for(int i = 0; i<n; i++) {
					if(n==4) {
						System.out.println("XL");
						break;
					}
					else {
						System.out.print("X");
					}
				}
				
				res2(res1);
				n =0;
			}
			if(n/5!=0) {
				res1 = n%50;
				n = n/50;  
				for(int i = 0; i<n; i++) {
					if(res1+5==9) {
						System.out.print("IX");
						res1 = res1-4;
						break;
					}
					else {
						System.out.print("V");
					}
					
				}
				
				res2(res1);
				n=0;
			
	
			}
			if(n/1!=0) {
				res1 = n%1;
				n = n/1;
				for(int i = 0; i<n; i++) {
					if(n==4) {
						System.out.print("IV");
						break;
					}
					else {
						System.out.print("I");
					}
				}
				System.out.println();
			}
			
			
		}
	
	}
	public static void res2(int num) {
		if(num/90!=0) {
			int m = num/90;
			 num = num%90;
			for(int i = 0; i<m; i++) {
				System.out.print("XC");
			}
		}
		if(num/50!=0) {
			int q = num/50;
			 num = num%50;
			for(int i = 0; i<q; i++) {
				System.out.print("L");
			}
		}
		if(num/40!=0) {
			int q = num/40;
			 num = num%40;
			for(int i = 0; i<q; i++) {
				System.out.print("XL");
			}
		}
		if(num/10!=0) {
			int s = num/10;
			num = num%10;
			for(int i = 0; i<s; i++) {
				System.out.print("X");
			}
		}
			if(num/5!=0) {
				int c = num/5;
				 num = num%5;
				for(int i = 0; i<c; i++) {
					if(num+5==9) {
						System.out.print("IX");
						num = num-4;
						break;
					}
					else {
						System.out.print("V");
					}
					
				}
			}
			if(num/1!=0) {
				int h = num/1;
				 num = num%1;
				for(int i = 0; i<h; i++) {
					if(h==4) {
						System.out.print("IV");
						break;
					}
					else {
						System.out.print("I");
					}
				}
			}
			System.out.println();
		
	}

}
